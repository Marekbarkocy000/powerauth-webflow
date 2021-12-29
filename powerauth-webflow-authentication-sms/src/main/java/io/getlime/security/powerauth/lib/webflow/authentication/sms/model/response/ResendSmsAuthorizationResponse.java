/*
 * PowerAuth Web Flow and related software components
 * Copyright (C) 2019 Wultra s.r.o.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.getlime.security.powerauth.lib.webflow.authentication.sms.model.response;

import io.getlime.security.powerauth.lib.webflow.authentication.base.AuthStepResponse;

/**
 * Response for resend SMS authorization.
 *
 * @author Roman Strobl, roman.strobl@wultra.com
 */
public class ResendSmsAuthorizationResponse extends AuthStepResponse {

    private int resendDelay;

    /**
     * Get delay for resending SMS in milliseconds.
     * @return Delay for resending SMS in milliseconds.
     */
    public int getResendDelay() {
        return resendDelay;
    }

    /**
     * Set delay for resending SMS in milliseconds.
     * @param resendDelay Delay for resending SMS in milliseconds.
     */
    public void setResendDelay(int resendDelay) {
        this.resendDelay = resendDelay;
    }
}
