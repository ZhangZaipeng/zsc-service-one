package com.zsc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/15.
 */
@RestController("/feign")
public class FeignInterfaceController {

    @RequestMapping(value = "/getUserById")
    public User getUserById(@RequestParam String id){
        User user = new User();
        user.setId(id);
        user.setName("zhang:" + id);
        user.setPassword("123456" + id);
        return user;
    }
}
