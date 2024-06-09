package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ZJ
 * @ClassName DynamicSQLMapperTest
 * @Description TODO
 * @date 2024/6/9 13:51
 * @Version 1.0
 */
public class DynamicSQLMapperTest {

    @Test
    public void getEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "zs", 20, "男");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }
}
