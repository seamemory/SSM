package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZJ
 * @ClassName DeptMapper
 * @Description TODO
 * @date 2024/6/1 15:34
 * @Version 1.0
 */
public interface DeptMapper {

    /**
     * 分步查询获取员工和部门信息第一步
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId")Integer deptId);

    /**
     * 查询部门和员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 通过分步查询，查询部门及部门中的员工 第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
