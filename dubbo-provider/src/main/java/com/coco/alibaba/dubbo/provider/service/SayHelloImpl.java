package com.coco.alibaba.dubbo.provider.service;

import com.coco.cloud.dubbo.api.SayHello;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author liuqiang@ourdocker.cn
 * @version 0.0.1
 * @date 2020/8/5 21:48
 */
@DubboService
public class SayHelloImpl implements SayHello {

    @Override
    public void hello() {
        System.out.println("hello");
    }

}
