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

package io.getlime.security.powerauth.lib.dataadapter.model.response;

import io.getlime.security.powerauth.lib.dataadapter.model.entity.FormData;

/**
 * Response with decorated operation form data.
 *
 * @author Roman Strobl, roman.strobl@wultra.com
 */
public class DecorateOperationFormDataResponse {

    private FormData formData;

    /**
     * Default constructor.
     */
    public DecorateOperationFormDataResponse() {
    }

    /**
     * Constructor with operation form data.
     * @param formData Operation form data.
     */
    public DecorateOperationFormDataResponse(FormData formData) {
        this.formData = formData;
    }

    /**
     * Get operation form data.
     * @return Operation form data.
     */
    public FormData getFormData() {
        return formData;
    }

    /**
     * Set operation form data.
     * @param formData Operation form data.
     */
    public void setFormData(FormData formData) {
        this.formData = formData;
    }
}