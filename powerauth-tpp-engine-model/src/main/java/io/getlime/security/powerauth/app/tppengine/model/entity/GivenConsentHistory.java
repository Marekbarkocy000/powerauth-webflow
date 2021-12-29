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

package io.getlime.security.powerauth.app.tppengine.model.entity;

import java.util.Date;

/**
 * Response entity object in the consent history.
 *
 * @author Petr Dvorak, petr@wultra.com
 */
public class GivenConsentHistory {

    /**
     * Given consent ID.
     */
    private Long id;

    /**
     * TPP application client ID.
     */
    private String clientId;

    /**
     * Change of the consent that was made. This data item is backed by
     * {@link io.getlime.security.powerauth.app.tppengine.model.enumeration.ConsentChange}
     * and can have the same values (represented as string).
     */
    private String change;

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
     * Consent parameters, to be filled to placeholders.
     */
    private String consentParameters;

    /**
     * External ID of the consent initiation, usually related to operation ID or some other
     * ID uniquely related to the operation.
     */
    private String externalId;

    /**
     * Timestamp of when the change was made.
     */
    private Date timestampCreated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
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

    public Date getTimestampCreated() {
        return timestampCreated;
    }

    public void setTimestampCreated(Date timestampCreated) {
        this.timestampCreated = timestampCreated;
    }
}
