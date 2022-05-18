package com.akon.spring.provider.service.impl;

import com.akon.spring.provider.domain.model.UserInfo;
import com.akon.spring.provider.domain.repository.UserInfoRepository;
import com.akon.spring.provider.facade.api.UserInfoFacade;
import com.akon.spring.provider.facade.dto.UserInfoDto;
import com.akon.spring.provider.service.convert.UserInfoConvert;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserInfoFacadeImpl implements UserInfoFacade {

    @Autowired
    UserInfoRepository repository;

    @Override
    public List<UserInfoDto> getUserInfo() {
        List<UserInfoDto> list=new ArrayList<>();
        List<UserInfo> allUserInfo = repository.getAllUserInfo();
        //转换
        return UserInfoConvert.INSTANCE.toDto(allUserInfo);

    }
}
