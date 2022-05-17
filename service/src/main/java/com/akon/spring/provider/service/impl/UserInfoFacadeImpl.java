package com.akon.spring.provider.service.impl;

import com.akon.spring.provider.facade.api.UserInfoFacade;
import com.akon.spring.provider.facade.dto.UserInfo;
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
