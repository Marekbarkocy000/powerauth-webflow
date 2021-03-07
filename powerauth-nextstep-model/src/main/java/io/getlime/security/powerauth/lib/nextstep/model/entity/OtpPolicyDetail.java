/*
 * Copyright 2021 Wultra s.r.o.
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
package io.getlime.security.powerauth.lib.nextstep.model.entity;

import io.getlime.security.powerauth.lib.nextstep.model.entity.enumeration.OtpPolicyStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class represents details of an OTP policy.
 *
 * @author Roman Strobl, roman.strobl@wultra.com
 */
@Data
@EqualsAndHashCode(of = "otpPolicyName")
public class OtpPolicyDetail {

    @NotNull
    private String otpPolicyName;
    private String description;
    @NotNull
    @Positive
    private Integer length;
    @PositiveOrZero
    private Integer attemptLimit;
    @Positive
    private Long expirationTime;
    private String genAlgorithm;
    @NotNull
    private Map<String, String> genParam = new LinkedHashMap<>();
    @NotNull
    private OtpPolicyStatus otpPolicyStatus;
    @NotNull
    private Date timestampCreated;
    private Date timestampLastUpdated;

}
