/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.snode.client.impl;

import org.apache.rocketmq.remoting.RemotingChannel;
import org.apache.rocketmq.snode.SnodeController;

public class IOTClientManagerImpl extends ClientManagerImpl {

    public static final String IOTGROUP = "IOTGROUP";
    private final SnodeController snodeController;

    public IOTClientManagerImpl(SnodeController snodeController) {
        this.snodeController = snodeController;
    }

    @Override
    public void onClosed(String group, RemotingChannel remotingChannel) {

    }

    @Override
    public void onUnregister(String group, RemotingChannel remotingChannel) {

    }

    @Override public void onRegister(String group, RemotingChannel remotingChannel) {

    }

    public SnodeController getSnodeController() {
        return snodeController;
    }
}
