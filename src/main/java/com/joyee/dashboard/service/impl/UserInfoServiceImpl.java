package com.joyee.dashboard.service.impl;

import cn.hutool.core.lang.Assert;
import com.joyee.dashboard.dao.entity.UserInfo;
import com.joyee.dashboard.dao.mapper.UserInfoMapper;
import com.joyee.dashboard.dao.mapstruct.UserInfoDOMapStruct;
import com.joyee.dashboard.service.DTO.UserInfoDTO;
import com.joyee.dashboard.service.UserInfoService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
/**
 * @description 用户信息
 * @author joyee
 * @date 2024-05-22
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private  UserInfoMapper userInfoMapper;

    @Override
    public Integer insert(UserInfoDTO userInfo) {
        // valid
        Assert.notNull(userInfo,"必要参数缺失");
        int id = userInfoMapper.insert(UserInfoDOMapStruct.INSTANCE.userInfoDTOToUserInfoDO(userInfo));
        return id;
    }


    @Override
    public void delete(Integer id) {
        int ret = 0;
                //userInfoMapper.deleteById(id);
    }


    @Override
    public void update(UserInfoDTO userInfo) {
        int ret = 0;
                //userInfoMapper.updateById(userInfoDOMapStruct.userInfoDTOToUserInfoDO(userInfo));
    }


    @Override
    public UserInfoDTO load(int id) {
        return UserInfoDOMapStruct.INSTANCE.userInfoDOToDTO(new UserInfo());
    }


    @Override
    public Map<String,UserInfoDTO> pageList(int offset, int pagesize) {



        return new HashMap<>();
    }

}
