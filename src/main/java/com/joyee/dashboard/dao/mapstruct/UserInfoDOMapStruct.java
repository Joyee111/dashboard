package com.joyee.dashboard.dao.mapstruct;

import com.joyee.dashboard.dao.entity.UserInfo;
import com.joyee.dashboard.service.DTO.UserInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserInfoDOMapStruct {

    UserInfoDOMapStruct INSTANCE = Mappers.getMapper(UserInfoDOMapStruct.class);

    UserInfo userInfoDTOToUserInfoDO(UserInfoDTO userInfo);

    UserInfoDTO userInfoDOToDTO(UserInfo userInfo);
}
