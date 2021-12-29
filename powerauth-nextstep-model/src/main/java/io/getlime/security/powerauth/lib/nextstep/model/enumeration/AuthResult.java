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
package io.getlime.security.powerauth.lib.nextstep.model.enumeration;

/**
 * Enum representing an authentication step result.
 *
 * @author Petr Dvorak, petr@wultra.com
 */
public enum AuthResult {

    /**
     * Continue with authentication, send user to the next authentication step.
     */
    CONTINUE,

    /**
     * Authentication failed, there are no more steps to perform.
     */
    FAILED,

    /**
     * Authentication succeeded, there are no more steps to perform.
     */
    DONE
}
