/*
 * Copyright 2017 Lime - HighTech Solutions s.r.o.
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
package io.getlime.security.powerauth.app.nextstep.repository;

import io.getlime.security.powerauth.app.nextstep.repository.model.entity.UserPrefsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Crud repository for persistence of user preferences.
 *
 * @author Roman Strobl, roman.strobl@lime-company.eu
 */
@Component
public interface UserPrefsRepository extends CrudRepository<UserPrefsEntity, String> {

    /**
     * Get user preferences for given user. Null is returned in case preferences are not available.
     *
     * @param userId User ID
     * @return User preferences.
     */
    UserPrefsEntity findUserPrefs(String userId);

}
