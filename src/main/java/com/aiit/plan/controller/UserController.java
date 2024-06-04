package com.aiit.plan.controller;

import com.aiit.plan.model.vo.UserVo;
import com.aiit.plan.service.intf.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xingheng
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @Value("${user2}")
    private String user;

    @RequestMapping("/all")
    public List<UserVo> getAllUser() {
        System.out.println("user: " + user);
        return userService.getAllUser();
    }
}
