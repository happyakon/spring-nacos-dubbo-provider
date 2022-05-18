package com.akon.spring.provider.repository.impl;

import com.akon.spring.provider.domain.model.UserInfo;
import com.akon.spring.provider.domain.repository.UserInfoRepository;
import com.akon.spring.provider.repository.dao.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoRepositoryImpl implements UserInfoRepository {

    @Resource
    UserInfoMapper userInfoMapper;

    @Override
    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    @Override
    public UserInfo selectByPrimaryKey(Integer userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<UserInfo> getAllUserInfo() {
        return userInfoMapper.getAllUserInfo();
    }
}
