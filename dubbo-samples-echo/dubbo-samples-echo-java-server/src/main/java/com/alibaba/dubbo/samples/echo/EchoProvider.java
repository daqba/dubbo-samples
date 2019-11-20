package com.alibaba.dubbo.samples.echo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.samples.echo.api.EchoService;
import com.alibaba.dubbo.samples.echo.impl.EchoServiceImpl;

import java.io.IOException;

/**
 * @author yiji@apache.org
 */
public class EchoProvider {
    public static void main(String[] args) throws IOException {
        ServiceConfig<EchoService> service = new ServiceConfig<>();
        service.setApplication(new ApplicationConfig("java-echo-provider"));
        service.setRegistry(new RegistryConfig("zookeeper://47.96.74.168:2181"));
        service.setInterface(EchoService.class);
        service.setRef(new EchoServiceImpl());
        service.export();
        System.out.println("java-echo-provider is running.");
        System.in.read();
    }
}
