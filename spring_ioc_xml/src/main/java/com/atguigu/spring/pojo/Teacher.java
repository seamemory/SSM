package com.atguigu.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author ZJ
 * @ClassName Teacher
 * @Description TODO
 * @date 2024/7/2 21:08
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher {

    private Integer tid;

    private String tname;
}
