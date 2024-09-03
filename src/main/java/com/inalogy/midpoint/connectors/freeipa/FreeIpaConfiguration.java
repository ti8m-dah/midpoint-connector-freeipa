/**
 * Copyright (c) Inalogy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.inalogy.midpoint.connectors.freeipa;

import com.evolveum.polygon.rest.AbstractRestConfiguration;
import org.identityconnectors.framework.spi.ConfigurationProperty;

/**
 * @author gpalos
 *
 */
public class FreeIpaConfiguration extends AbstractRestConfiguration {
    private int sizelimit = 100;
    private int timelimit = 2;
    private boolean support_preserved = false;

    @ConfigurationProperty(
            displayMessageKey = "freeipa.config.sizelimit",
            helpMessageKey = "freeipa.config.sizelimit.help"
    )
    public Integer getSizelimit() {
        return this.sizelimit;
    }

    public void setSizelimit(Integer sizelimit) {
        this.sizelimit = sizelimit;
    }

    @ConfigurationProperty(
            displayMessageKey = "freeipa.config.timelimit",
            helpMessageKey = "freeipa.config.timelimit.help"
    )
    public Integer getTimelimit() {
        return this.timelimit;
    }

    public void setTimelimit(Integer timelimit) {
        this.timelimit = timelimit;
    }

    @ConfigurationProperty(
            displayMessageKey = "freeipa.config.support_preserved",
            helpMessageKey = "freeipa.config.support_preserved.help"
    )
    public Boolean getSupportPreserved() {
        return this.support_preserved;
    }

    public void setSupportPreserved(Boolean support_preserved) {
        this.support_preserved = support_preserved;
    }
}
