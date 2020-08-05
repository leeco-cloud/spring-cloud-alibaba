package com.coco.alibaba.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan(basePackages = {"com.coco.alibaba.dubbo.provider.service"})
@SpringBootApplication
public class DubboCustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboCustomApplication.class, args);
    }

}
