package com.lf.user.controller;


import com.lf.user.service.AdminService;
import com.lf.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-02-28
 */
@Api(tags = "管理员信息管理")
@CrossOrigin
@RestController
@RequestMapping("/eduservice/admin")
public class AdminController {
    @Autowired
    public AdminService adminService;

    @ApiOperation(value = "管理员登录")
    @PostMapping("login")
    public R login(){
//        return R.ok().data("token","admin");
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://edu-20211206.oss-cn-beijing.aliyuncs.com/2021/12/07/816dec341a6945e38084e83de4553083file.png");

    }

    @ApiOperation(value = "获取管理员信息")
    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://edu-20211206.oss-cn-beijing.aliyuncs.com/2021/12/07/816dec341a6945e38084e83de4553083file.png");
    }

}

