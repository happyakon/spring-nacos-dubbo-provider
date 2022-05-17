package com.akon.spring.bootstrap.rest;

import com.akon.spring.facade.api.UserInfoFacade;
import com.akon.spring.facade.dto.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserInfoRest {

    @Resource
    UserInfoFacade userInfoFacade;

    @RequestMapping("/getUser")
    public UserInfo getUserInfo(){
        return userInfoFacade.getUserInfo();
    }
}
