package com.akon.spring.provider.facade.api;

import com.akon.spring.provider.facade.dto.UserInfoDto;

import java.util.List;

public interface UserInfoFacade {

    List<UserInfoDto> getUserInfo();

    int insert(UserInfoDto record);
}
