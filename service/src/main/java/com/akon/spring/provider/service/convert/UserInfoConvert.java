package com.akon.spring.provider.service.convert;

import com.akon.spring.provider.domain.model.UserInfo;
import com.akon.spring.provider.facade.dto.UserInfoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserInfoConvert {

    UserInfoConvert INSTANCE= Mappers.getMapper(UserInfoConvert.class);
    @Mapping(target ="createTime",source = "createTime",dateFormat = "yyyy-MM-dd")
    @Mapping(target ="updateTime",source = "updateTime",dateFormat = "yyyy-MM-dd")
    UserInfoDto toDto(UserInfo userInfo);

    @Mapping(target ="createTime",source = "createTime",dateFormat = "yyyy-MM-dd")
    @Mapping(target ="updateTime",source = "updateTime",dateFormat = "yyyy-MM-dd")
    List<UserInfoDto> toDto(List<UserInfo> list);

    @Mapping(target ="createTime",source = "createTime",dateFormat = "yyyy-MM-dd")
    @Mapping(target ="updateTime",source = "updateTime",dateFormat = "yyyy-MM-dd")
    UserInfo toDo(UserInfoDto userInfoDto);
}
