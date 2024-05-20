package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

/**
 * @author ZJ
 * @ClassName UesrMapper
 * @Description TODO
 * @date 2024/5/20 8:52
 * @Version 1.0
 */
public interface UesrMapper {

    int insertUser();

    int updateUser();

    int deleteUser();

    User getUserById();
}
