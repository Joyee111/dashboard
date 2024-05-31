package com.joyee.dashboard.service;

import com.joyee.dashboard.service.DTO.UserInfoDTO;

import java.util.Map;
/**
 * @description 用户信息
 * @author joyee
 * @date 2024-05-22
 */
public interface UserInfoService {

    /**
     * 新增
     */
    public Integer insert(UserInfoDTO userInfoDTO);

    /**
     * 删除
     */
    public void delete(Integer id);

    /**
     * 更新
     */
    public void update(UserInfoDTO userInfoDTO);

    /**
     * 根据主键 id 查询
     */
    public UserInfoDTO load(int id);

    /**
     * 分页查询
     */
    public Map<String,UserInfoDTO> pageList(int offset, int pagesize);

}
