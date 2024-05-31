package com.joyee.dashboard.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.joyee.dashboard.dao.entity.UserInfo;
import com.joyee.dashboard.service.DTO.UserInfoDTO;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
@Resource
public interface UserInfoMapper  extends BaseMapper<UserInfo> {
    List<UserInfoDTO> selectListByPage(int offset, int pagesize);
}
