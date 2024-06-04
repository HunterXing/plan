package com.aiit.plan.service.impl;

import com.aiit.plan.mapper.UserMapper;
import com.aiit.plan.model.dto.UserDto;
import com.aiit.plan.model.vo.UserVo;
import com.aiit.plan.service.intf.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xingheng
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    /**
     * 登录
     * @param name     姓名
     * @param password 密码
     * @return boolean
     * @author xingheng
     */
    @Override
    public boolean login(String name, String password) {
        return false;
    }

    /**
     * 注册
     * @param userDto 用户实体对象
     * @return boolean
     * @author xingheng
     */
    @Override
    public UserVo register(UserDto userDto) {
        return null;
    }

    /**
     * 查询用户列表
     * @return List<UserVo> 用户列表
     * @author xingheng
     */
    @Override
    public List<UserVo> getAllUser() {
        return userMapper.getAllUser();
    }

    /**
     * 根据id查询用户信息
     * @param id 用户id
     * @return UserVo 用户信息
     * @author xingheng
     */
    @Override
    public UserVo getUserById(Integer id) {
        return null;
    }
}
