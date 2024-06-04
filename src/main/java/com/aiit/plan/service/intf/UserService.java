package com.aiit.plan.service.intf;

import com.aiit.plan.model.dto.UserDto;
import com.aiit.plan.model.vo.UserVo;

import java.util.List;

/**
 * @author xingheng
 */
public interface UserService {

    /**
     *  登录
     * @param name 姓名
     * @param password 密码
     * @return boolean
     * @author xingheng
     */
    boolean login(String name, String password);

    /**
     *  注册
     * @param userDto 用户实体对象
     * @return boolean
     * @author xingheng
     */
    UserVo register(UserDto userDto);

    /**
     * 查询用户列表
     * @return List<UserVo> 用户列表
     * @author xingheng
     */
    List<UserVo> getAllUser();

    /**
     *  根据id查询用户信息
     * @param id 用户id
     * @return UserVo 用户信息
     * @author xingheng
     */
    UserVo getUserById(Integer id);
}
