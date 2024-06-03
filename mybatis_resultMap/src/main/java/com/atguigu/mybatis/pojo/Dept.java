package com.atguigu.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ZJ
 * @ClassName Dept
 * @Description TODO
 * @date 2024/5/29 22:20
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {

    private Integer deptId;

    private String deptName;

    private List<Emp> emps;


}
