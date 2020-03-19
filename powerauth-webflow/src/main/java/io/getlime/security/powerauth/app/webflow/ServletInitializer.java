/*
 * Copyright 2017 Wultra s.r.o.
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
package io.getlime.security.powerauth.app.webflow;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.security.Security;

/**
 * Servlet initializer which handles application startup in a web container.
 *
 * @author Roman Strobl, roman.strobl@wultra.com
 */
public class ServletInitializer extends SpringBootServletInitializer {

    /**
     * Configure servlet initializer - set up Bouncy Castle crypto provider.
     * @param application Application.
     * @return Spring application builder.
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // Register BC provider
        Security.addProvider(new BouncyCastleProvider());

        return application.sources(PowerAuthWebFlowApplication.class);
    }

}
