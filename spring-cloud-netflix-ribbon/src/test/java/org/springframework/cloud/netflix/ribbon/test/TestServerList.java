/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.netflix.ribbon.test;

import java.util.ArrayList;
import java.util.List;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;

/**
 * @author Spencer Gibb
 */
public class TestServerList<T extends Server> implements ServerList<T> {

	private final List<T> servers;

	public TestServerList() {
		this.servers = new ArrayList<>();
	}

	public void add(T server) {
		this.servers.add(server);
	}

	@Override
	public List<T> getInitialListOfServers() {
		return servers;
	}

	@Override
	public List<T> getUpdatedListOfServers() {
		return servers;
	}

}
