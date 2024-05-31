package com.joyee.dashboard.controller;

import com.joyee.dashboard.common.pojo.CommonResult;
import com.joyee.dashboard.controller.PO.UserInfoPO;
import com.joyee.dashboard.controller.mapstruct.UserInfoMapStruct;
import com.joyee.dashboard.service.DTO.UserInfoDTO;
import com.joyee.dashboard.service.UserInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

/**
 * @description 用户信息
 * @author joyee
 * @date 2024-05-22
 */
@RestController
@RequestMapping(value = "/userInfo")
@Tag(name = "用户管理")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    /**
     * 新增
     * @author joyee
     * @date 2024/05/22
     **/
    @RequestMapping("/insert")
    @Operation(summary = "新增")
    public Integer insert(UserInfoPO userInfo){
        return userInfoService.insert(UserInfoMapStruct.INSTANCE.userInfoPOtoUserInfoDTO(userInfo));
    }

    /**
     * 刪除
     * @author joyee
     * @date 2024/05/22
     **/
    @RequestMapping("/delete")
    public Boolean delete(int id){
         userInfoService.delete(id);
         return CommonResult.isSuccess(200);
    }

    /**
     * 更新
     * @author joyee
     * @date 2024/05/22
     **/
    @RequestMapping("/update")
    public Boolean update(UserInfoPO userInfo){
         userInfoService.update(UserInfoMapStruct.INSTANCE.userInfoPOtoUserInfoDTO(userInfo));
        return CommonResult.isSuccess(200);
    }

    /**
     * 查询 根据主键 id 查询
     * @author joyee
     * @date 2024/05/22
     **/
    @RequestMapping("/load")
    public UserInfoDTO load(int id){
        return userInfoService.load(id);
    }

    /**
     * 查询 分页查询
     * @author joyee
     * @date 2024/05/22
     **/
    @RequestMapping("/pageList")
    public Map<String, UserInfoDTO> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                             @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return userInfoService.pageList(offset, pagesize);
    }

}
