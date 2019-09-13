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

package io.getlime.security.powerauth.app.tppengine.model.response;

/**
 * Information about just given consent.
 *
 * @author Petr Dvorak, petr@wultra.com
 */
public class GiveConsentResponse {

    /**
     * Given consent ID.
     */
    private Long id;

    /**
     * User ID.
     */
    private String userId;

    /**
     * TPP application client ID.
     */
    private String clientId;

    /**
     * Consent ID.
     */
    private String consentId;

    /**
     * Name of the consent.
     */
    private String consentName;

    /**
     * Text of the consent, possibly with placeholders.
     */
    private String consentText;

    /**
     * Parameters of the consent, to be filled in to placeholders.
     */
    private String consentParameters;

    /**
     * External ID of the consent initiation, usually related to operation ID or some other
     * ID uniquely related to the operation.
     */
    private String externalId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public String getConsentName() {
        return consentName;
    }

    public void setConsentName(String consentName) {
        this.consentName = consentName;
    }

    public String getConsentText() {
        return consentText;
    }

    public void setConsentText(String consentText) {
        this.consentText = consentText;
    }

    public String getConsentParameters() {
        return consentParameters;
    }

    public void setConsentParameters(String consentParameters) {
        this.consentParameters = consentParameters;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
}
