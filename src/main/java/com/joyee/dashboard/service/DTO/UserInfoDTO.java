package com.joyee.dashboard.service.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfoDTO {
    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String userNickName;

    /**
     * 状态 1 在线 11 离开 111 隐身
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 删除标记 0 未删除 1 已删除
     */
    private Integer deleteFlag;
}
