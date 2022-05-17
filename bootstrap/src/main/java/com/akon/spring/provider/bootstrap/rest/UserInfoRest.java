package com.akon.spring.provider.bootstrap.rest;

import com.akon.spring.provider.facade.api.UserInfoFacade;
import com.akon.spring.provider.facade.dto.UserInfo;
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
