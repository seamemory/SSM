package com.atguigu.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZJ
 * @ClassName Student
 * @Description TODO
 * @date 2024/6/30 16:37
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Person{

    private Integer sid;

    private String sname;

    private Integer age;

    private String gender;
}
