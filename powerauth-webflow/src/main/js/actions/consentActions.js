/*
 * Copyright 2019 Wultra s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import axios from "axios";
import {dispatchAction, dispatchError} from "../dispatcher/dispatcher";

/**
 * Initialize OAuth 2.0 consent form.
 * @returns {Function} No return value.
 */
export function init() {
    return function (dispatch) {
        dispatch({
            type: "SHOW_SCREEN_CONSENT",
            payload: {
                loading: true,
                error: false,
                message: ""
            }
        });
        axios.post("./api/auth/consent/init", {}, {
            headers: {
                'X-OPERATION-HASH': operationHash,
            }
        }).then((response) => {
            if (response.data.result === 'AUTH_FAILED') {
                dispatchAction(dispatch, response);
                return;
            }
            dispatch({
                type: "SHOW_SCREEN_CONSENT",
                payload: {
                    loading: false,
                    error: false,
                    consentHtml: response.data.consentHtml,
                    options: response.data.options
                }
            });
            return null;
        }).catch((error) => {
            dispatchError(dispatch, error);
        })
    }
}

/**
 * Perform SMS authentication.
 * @returns {Function} No return value.
 */
export function authenticate(options) {
    return function (dispatch) {
        axios.post("./api/auth/consent/authenticate", {
            options
        }, {
            headers: {
                'X-OPERATION-HASH': operationHash,
            }
        }).then((response) => {
            switch (response.data.result) {
                case 'CONFIRMED': {
                    dispatchAction(dispatch, response);
                    break;
                }
                case 'CANCELED': {
                    dispatch({
                        type: "SHOW_SCREEN_ERROR",
                        payload: {
                            message: response.data.message
                        }
                    });
                    break;
                }
                case 'AUTH_FAILED': {
                    // handle timeout - action can not succeed anymore, show error
                    if (response.data.message === "operation.timeout") {
                        dispatchAction(dispatch, response);
                        break;
                    }
                    // if the operation has been interrupted by new operation, show an error
                    if (response.data.message === "operation.interrupted") {
                        dispatchAction(dispatch, response);
                        break;
                    }
                    // if the maximum number of attempts has been exceeded, show an error, the method cannot continue
                    if (response.data.message === "authentication.maxAttemptsExceeded") {
                        dispatchAction(dispatch, response);
                        break;
                    }
                    // if there is no supported auth method, show error, there is no point in continuing
                    if (response.data.message === "error.noAuthMethod") {
                        dispatchAction(dispatch, response);
                        break;
                    }
                    dispatch({
                        type: "SHOW_SCREEN_CONSENT",
                        payload: {
                            loading: false,
                            error: true,
                            message: response.data.message,
                            remainingAttempts: response.data.remainingAttempts,
                            consentValidationPassed: response.data.consentValidationPassed,
                            validationErrorMessage: response.data.validationErrorMessage,
                            optionValidationResults: response.data.optionValidationResults
                        }
                    });
                    break;
                }
            }
            return null;
        }).catch((error) => {
            dispatchError(dispatch, error);
        })
    }
}

/**
 * Cancel operation.
 * @returns {Function} No return value.
 */
export function cancel() {
    return function (dispatch) {
        axios.post("./api/auth/consent/cancel", {}, {
            headers: {
                'X-OPERATION-HASH': operationHash,
            }
        }).then((response) => {
            dispatch({
                type: "SHOW_SCREEN_ERROR",
                payload: {
                    message: response.data.message
                }
            });
            return null;
        }).catch((error) => {
            dispatchError(dispatch, error);
        })
    }
}