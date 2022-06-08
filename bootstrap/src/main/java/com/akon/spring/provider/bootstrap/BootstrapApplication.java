package com.akon.spring.provider.bootstrap;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.akon.spring.provider"})
@EnableDiscoveryClient
@DubboComponentScan(basePackages = {"com.akon.spring.provider"})
@MapperScan(basePackages = {"com.akon.spring.provider.repository"})
public class BootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapApplication.class, args);
    }

}
