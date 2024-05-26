package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author ZJ
 * @ClassName SelectMapper
 * @Description TODO
 * @date 2024/5/26 18:28
 * @Version 1.0
 */
public interface SelectMapper {

    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();

    Map<String ,Object> getUserByIdToMap(@Param("id")Integer id);

    List<Map<String,Object>> getAllUserToMap();
}
