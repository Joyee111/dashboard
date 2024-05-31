package com.joyee.dashboard.controller.mapstruct;

import com.joyee.dashboard.controller.PO.UserInfoPO;
import com.joyee.dashboard.service.DTO.UserInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserInfoMapStruct {
    UserInfoMapStruct INSTANCE = Mappers.getMapper(UserInfoMapStruct.class);
    UserInfoDTO userInfoPOtoUserInfoDTO(UserInfoPO userInfoPO);
}
