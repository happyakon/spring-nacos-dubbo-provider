package com.akon.spring.provider.domain.repository;

import com.akon.spring.provider.domain.model.UserInfo;

import java.util.List;

public interface UserInfoRepository {
    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> getAllUserInfo();
}
