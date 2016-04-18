/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.plugin.policy.impl;

import io.gravitee.plugin.core.api.Plugin;
import io.gravitee.plugin.core.api.PluginManifest;
import io.gravitee.plugin.core.api.PluginType;
import io.gravitee.plugin.policy.Policy;

import java.net.URL;
import java.nio.file.Path;

/**
 * @author David BRASSELY (david at gravitee.io)
 * @author GraviteeSource Team
 */
public class PolicyImpl implements Policy {

    private final Plugin plugin;
    private final Class<?> policyClass;

    public PolicyImpl(final Plugin plugin, final Class<?> policyClass) {
        this.plugin = plugin;
        this.policyClass = policyClass;
    }

    @Override
    public Class<?> policy() {
        return policyClass;
    }

    @Override
    public String clazz() {
        return plugin.clazz();
    }

    @Override
    public URL[] dependencies() {
        return plugin.dependencies();
    }

    @Override
    public String id() {
        return plugin.id();
    }

    @Override
    public PluginManifest manifest() {
        return plugin.manifest();
    }

    @Override
    public Path path() {
        return plugin.path();
    }

    @Override
    public PluginType type() {
        return plugin.type();
    }
}
