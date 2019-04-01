#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * Copyright ${year}-present Open Networking Foundation
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
package ${package};

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.onosproject.cfg.ComponentConfigService;
import org.onosproject.cfg.ConfigProperty;

import java.util.Set;

/**
 * Set of tests of the ONOS application component.
 */
public class AppComponentTest {

    private AppComponent component;

    @Before
    public void setUp() {
        component = new AppComponent();
        component.cfgService = new TestComponentConfigService();
        component.activate();
    }

    @After
    public void tearDown() {
        component.deactivate();
    }

    @Test
    public void basics() {

    }

    private class TestComponentConfigService implements ComponentConfigService {
        @Override
        public Set<String> getComponentNames() {
            return null;
        }

        @Override
        public void registerProperties(Class<?> componentClass) {

        }

        @Override
        public void unregisterProperties(Class<?> componentClass, boolean clear) {

        }

        @Override
        public Set<ConfigProperty> getProperties(String componentName) {
            return null;
        }

        @Override
        public void setProperty(String componentName, String name, String value) {

        }

        @Override
        public void preSetProperty(String componentName, String name, String value) {

        }

        @Override
        public void unsetProperty(String componentName, String name) {

        }

        @Override
        public ConfigProperty getProperty(String componentName, String attribute) {
            return null;
        }
    }

}
