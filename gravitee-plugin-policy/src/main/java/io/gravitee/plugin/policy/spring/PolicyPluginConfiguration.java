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
package io.gravitee.plugin.policy.spring;

import io.gravitee.plugin.policy.PolicyClassLoaderFactory;
import io.gravitee.plugin.policy.PolicyConfigurationClassResolver;
import io.gravitee.plugin.policy.PolicyPluginManager;
import io.gravitee.plugin.policy.PolicyMethodResolver;
import io.gravitee.plugin.policy.impl.PolicyClassLoaderFactoryImpl;
import io.gravitee.plugin.policy.impl.PolicyConfigurationClassResolverImpl;
import io.gravitee.plugin.policy.impl.PolicyPluginManagerImpl;
import io.gravitee.plugin.policy.impl.PolicyMethodResolverImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
@Configuration
public class PolicyPluginConfiguration {

    @Bean
    public PolicyPluginManager policyManager() {
        return new PolicyPluginManagerImpl();
    }

    @Bean
    public PolicyMethodResolver policyMethodResolver() {
        return new PolicyMethodResolverImpl();
    }

    @Bean
    public PolicyConfigurationClassResolver policyConfigurationClassResolver() {
        return new PolicyConfigurationClassResolverImpl();
    }

    @Bean
    public PolicyClassLoaderFactory policyClassLoaderFactory() {
        return new PolicyClassLoaderFactoryImpl();
    }
}
