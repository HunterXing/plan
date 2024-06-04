package com.aiit.plan.mapper;

import com.aiit.plan.model.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xingheng
 */
@Mapper
public interface UserMapper {
    /**
     *  获取所有用户信息
     * @return List<UserVo>
     */
    List<UserVo> getAllUser();
}
