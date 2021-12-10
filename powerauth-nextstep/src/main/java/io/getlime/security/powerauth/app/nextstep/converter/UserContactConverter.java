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
package io.getlime.security.powerauth.app.nextstep.converter;

import io.getlime.security.powerauth.app.nextstep.repository.model.entity.UserContactEntity;
import io.getlime.security.powerauth.lib.nextstep.model.entity.UserContactDetail;

/**
 * Converter for user contacts.
 *
 * @author Roman Strobl, roman.strobl@wultra.com
 */
public class UserContactConverter {

    /**
     * Convert user contact entity to detail.
     * @param contact User contact entity.
     * @return User contact detail.
     */
    public UserContactDetail fromEntity(UserContactEntity contact) {
        final UserContactDetail contactDetail = new UserContactDetail();
        contactDetail.setContactName(contact.getName());
        contactDetail.setContactType(contact.getType());
        contactDetail.setContactValue(contact.getValue());
        contactDetail.setPrimary(contact.isPrimary());
        contactDetail.setTimestampCreated(contact.getTimestampCreated());
        contactDetail.setTimestampLastUpdated(contact.getTimestampLastUpdated());
        return contactDetail;
    }

}