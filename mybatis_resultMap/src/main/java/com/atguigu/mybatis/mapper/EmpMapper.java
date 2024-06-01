package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZJ
 * @ClassName EmpMapper
 * @Description TODO
 * @date 2024/5/29 22:22
 * @Version 1.0
 */
public interface EmpMapper {

    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 获取员工和部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 分步查询获取员工和部门信息第一步
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

}
