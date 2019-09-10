/*
 *
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package com.alibaba.dubbo.samples.echo;

//import com.alipay.sofa.spring.cloud.registry.mesh.SofaMeshDiscoveryAutoConfiguration;
//import com.alipay.sofa.spring.cloud.registry.mesh.SofaMeshRestTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(/*exclude = {SofaMeshDiscoveryAutoConfiguration.class, SofaMeshRestTemplateAutoConfiguration.class}*/)
@ImportResource("spring/echo-provider.xml")
public class EchoProvider {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(EchoProvider.class).run(args);
    }
}