package com.ailian.cliback.controller;

import com.ailian.cliback.common.api.CommonResult;
import com.ailian.cliback.model.UmsAdmin;
import com.ailian.cliback.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(tags = "UserController", description = "UserController")
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("get all users info")
    @RequestMapping(value = "getAllUser", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsAdmin>> getBrandList() {
        return CommonResult.success(userService.getAllUser());
    }

}
