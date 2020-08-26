package com.coco.alibaba.nacos.nacos;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqiang@ourdocker.cn
 * @version 0.0.1
 * @date 2020/8/26 21:58
 */
@NacosPropertySource(dataId = "nacos-discoevry",autoRefreshed = true)
@RestController
public class NacosController {

    @NacosValue(value = "${configInfo:hello}",autoRefreshed = true)
    private String configInfo;

    @GetMapping("/get")
    public String test(){
        return configInfo;
    }

}
