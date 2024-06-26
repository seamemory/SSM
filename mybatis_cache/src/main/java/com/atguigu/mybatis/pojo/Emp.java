package com.atguigu.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ZJ
 * @ClassName Emp
 * @Description TODO
 * @date 2024/6/9 13:33
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {

    private Integer empId;

    private String empName;

    private Integer age;

    private String gender;
}
