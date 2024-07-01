package com.atguigu.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author ZJ
 * @ClassName Clazz
 * @Description TODO
 * @date 2024/7/1 21:49
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Clazz {

    private Integer cid;

    private String cname;
}
