/*
 * PowerAuth Web Flow and related software components
 * Copyright (C) 2017 Wultra s.r.o.
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
package io.getlime.security.powerauth.lib.dataadapter.model.enumeration;

/**
 * Enumeration representing current user account status.
 *
 * @author Roman Strobl, roman.strobl@wultra.com
 */
public enum AccountStatus {

    /**
     * User account status is active.
     */
    ACTIVE,

    /**
     * User account is not active (e.g. blocked or suspended for any other reason).
     */
    NOT_ACTIVE

}
