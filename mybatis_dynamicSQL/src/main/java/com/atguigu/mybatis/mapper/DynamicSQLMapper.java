package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;

import java.util.List;

/**
 * @author ZJ
 * @ClassName DynamicSQLMapper
 * @Description TODO
 * @date 2024/6/9 13:36
 * @Version 1.0
 */
public interface DynamicSQLMapper {

    /**
     * 根据条件查询员工信息
     * @param emp
     * @return
     */
             List<Emp> getEmpByCondition(Emp emp);
        }
