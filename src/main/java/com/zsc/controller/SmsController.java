package com.zsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangZaiPeng on 2018/1/24.
 */
@RestController
@RefreshScope // 热更新++++
public class SmsController {

    @Value("${configString}")
    private String configString;

    @RequestMapping("/test")
    public String getConfigString(){
        return "configString值" + configString;
    }

    @Autowired
    private Environment env;

    @RequestMapping("/get/{configName}")
    public String getEnvPro(@PathVariable String configName){
        return configName + "的值为：" + env.getProperty("tony." + configName);
    }
}
