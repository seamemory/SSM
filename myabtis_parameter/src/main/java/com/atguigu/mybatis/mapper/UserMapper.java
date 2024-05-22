package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author ZJ
 * @ClassName UserMapper
 * @Description TODO
 * @date 2024/5/21 21:55
 * @Version 1.0
 */
public interface UserMapper {

    User getUserByUsername(String username);

    User checkLogin(@Param("username") String username,@Param("password") String password);

    User checkLoginByMap(Map<String,Object> map);

    void insertUser(User user);

}
