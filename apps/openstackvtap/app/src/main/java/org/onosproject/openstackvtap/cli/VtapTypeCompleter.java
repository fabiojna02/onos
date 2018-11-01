/*
 * Copyright 2018-present Open Networking Foundation
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
package org.onosproject.openstackvtap.cli;

import com.google.common.collect.Lists;
import org.onosproject.cli.AbstractChoicesCompleter;

import java.util.List;

/**
 * Vtap type completer.
 */
public class VtapTypeCompleter extends AbstractChoicesCompleter {

    @Override
    protected List<String> choices() {
        List<String> strings = Lists.newArrayList();
        strings.add("all");
        strings.add("rx");
        strings.add("tx");
        strings.add("any");
        return strings;
    }
}
