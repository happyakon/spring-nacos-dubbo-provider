package com.akon.spring.service.impl;

import com.akon.spring.facade.api.UserInfoFacade;
import com.akon.spring.facade.dto.UserInfo;
import com.alibaba.dubbo.config.annotation.Service;


@Service
public class UserInfoFacadeImpl implements UserInfoFacade {
    @Override
    public UserInfo getUserInfo() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserName("陈彬");
        userInfo.setAge(30);
        return userInfo;
    }
}
