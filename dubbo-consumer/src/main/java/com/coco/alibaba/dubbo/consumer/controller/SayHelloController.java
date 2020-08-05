package com.coco.alibaba.dubbo.consumer.controller;

import com.coco.cloud.dubbo.api.SayHello;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqiang@ourdocker.cn
 * @version 0.0.1
 * @date 2020/8/5 22:32
 */
@RestController
public class SayHelloController {

    @Reference
    private SayHello sayHello;

    @GetMapping("/sayHello")
    public void sayHello(){
        sayHello.hello();
    }

}
