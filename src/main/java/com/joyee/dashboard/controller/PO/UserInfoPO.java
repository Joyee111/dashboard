package com.joyee.dashboard.controller.PO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Schema(description = "用户信息")
@Data
public class UserInfoPO {
    /**
     * 用户编号
     */
    @Schema(description = "用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋道")
    @NotBlank(message = "用户编号不能为空")
    @Size(max = 30, message = "用户编号长度不能超过 30 个字符")
    private Integer userId;

    /**
     * 用户名
     */
    @Schema(description = "用户名", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋道")
    @NotBlank(message = "用户名不能为空")
    @Size(max = 30, message = "用户名长度不能超过 30 个字符")
    private String userName;

    /**
     * 昵称
     */
    @Schema(description = "昵称", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋道")
    @NotBlank(message = "昵称不能为空")
    @Size(max = 30, message = "昵称长度不能超过 30 个字符")
    private String userNickName;

    /**
     * 状态 1 在线 11 离开 111 隐身
     */
    @Schema(description = "状态 1 在线 11 离开 111 隐身", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋道")
    @NotBlank(message = "状态 1 在线 11 离开 111 隐身不能为空")
    @Size(max = 30, message = "部门名称长度不能超过 30 个字符")
    private Integer status;

    /**
     * 创建时间
     */
    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋道")
    @NotBlank(message = "创建时间不能为空")
    @Size(max = 30, message = "部门名称长度不能超过 30 个字符")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @Schema(description = "修改时间", requiredMode = Schema.RequiredMode.REQUIRED, example = "芋道")
    @NotBlank(message = "修改时间不能为空")
    @Size(max = 30, message = "修改时间长度不能超过 30 个字符")
    private LocalDateTime modifyTime;

    /**
     * 删除标记 0 未删除 1 已删除
     */
    @Schema(description = "删除标记 0 未删除 1 已删除", requiredMode = Schema.RequiredMode.REQUIRED, example = "0")
    @NotBlank(message = "删除标记 0 未删除 1 已删除不能为空")
    @Size(max = 30, message = "部门名称长度不能超过 30 个字符")
    private Integer deleteFlag;
}
