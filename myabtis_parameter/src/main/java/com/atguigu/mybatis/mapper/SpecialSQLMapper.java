package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZJ
 * @ClassName SpecialSQLMapper
 * @Description TODO
 * @date 2024/5/26 19:44
 * @Version 1.0
 */
public interface SpecialSQLMapper {

    /**
     * 通过用户名魔术查询
     */
    List<User> getUserByFuzzy(@Param("fuzzy") String fuzzy);

    /**
     * 批量删除
     */
    void deleteMoreUser(@Param("ids") String ids);
}
