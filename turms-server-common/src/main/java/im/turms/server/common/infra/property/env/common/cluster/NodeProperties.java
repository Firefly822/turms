/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.infra.property.env.common.cluster;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import im.turms.server.common.infra.property.metadata.Description;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class NodeProperties {

    public static final int NODE_ID_MAX_LENGTH = 32;

    @Description("The node ID must start with a letter or underscore, "
            + "and matches zero or more of characters [a-zA-Z0-9_] after the beginning. "
            + "e.g. \"turms001\", \"turms_002\"")
    private String id = "";

    @Description("e.g. \"us-east-1\" and \"ap-east-1\"")
    private String zone = "";

    private boolean activeByDefault = true;

    @Description("Only works when it is a turms-service node")
    private boolean leaderEligible = true;

}