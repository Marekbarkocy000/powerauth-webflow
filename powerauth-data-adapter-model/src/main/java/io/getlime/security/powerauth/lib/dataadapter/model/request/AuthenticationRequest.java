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
package io.getlime.security.powerauth.lib.dataadapter.model.request;

import io.getlime.security.powerauth.lib.dataadapter.model.entity.OperationContext;
import io.getlime.security.powerauth.lib.dataadapter.model.enumeration.AuthenticationType;

/**
 * Request for authenticating user with username and password.
 *
 * @author Roman Strobl
 */
public class AuthenticationRequest {

    /**
     * Username for this authentication request.
     */
    private String username;
    /**
     * Password for this authentication request.
     */
    private String password;
    /**
     * Authentication type which defines how username and password fields are used.
     */
    private AuthenticationType type;

    /**
     * Operation context.
     */
    private OperationContext operationContext;

    /**
     * Empty constructor.
     */
    public AuthenticationRequest() {
    }

    /**
     * Constructor with all parameters for convenience.
     * @param username username for this authentication request
     * @param password password for this authentication request
     * @param type authentication type
     */
    public AuthenticationRequest(String username, String password, AuthenticationType type, OperationContext operationContext) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.operationContext = operationContext;
    }

    /**
     * Set the username.
     * @param username username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the username.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the password.
     * @param password password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the password.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the authentication type.
     * @param type authentication type
     */
    public void setType(AuthenticationType type) {
        this.type = type;
    }

    /**
     * Get the authentication type.
     * @return authentication type
     */
    public AuthenticationType getType() {
        return type;
    }

    /**
     * Get operation context.
     * @return Operation context.
     */
    public OperationContext getOperationContext() {
        return operationContext;
    }

    /**
     * Set operation context.
     * @param operationContext Operation context.
     */
    public void setOperationContext(OperationContext operationContext) {
        this.operationContext = operationContext;
    }
}
