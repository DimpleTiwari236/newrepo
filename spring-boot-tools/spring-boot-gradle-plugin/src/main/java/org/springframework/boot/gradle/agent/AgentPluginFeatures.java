/*
 * Copyright 2012-2015 the original author or authors.
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

package org.springframework.boot.gradle.agent;

import org.gradle.api.Project;

import org.springframework.boot.gradle.PluginFeatures;

/**
 * {@link PluginFeatures} to add Java Agent support.
 *
 * @author Phillip Webb
 */
public class AgentPluginFeatures implements PluginFeatures {

	@Override
	public void apply(Project project) {
		project.afterEvaluate(new AgentTasksEnhancer());
	}

}
