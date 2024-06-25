package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.CacheMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ZJ
 * @ClassName CacheMapperTest
 * @Description TODO
 * @date 2024/6/23 22:08
 * @Version 1.0
 */
public class CacheMapperTest {

    /**
     * 一级缓存是SqlSession级别的，通过同一个SqlSession查询的数据会被缓存，下次查询相同的数据，就会从缓存中直接获取，不会从数据库重新访问
     * 使一级缓存失效的四种情况：
     *  1)不同的SqlSession对应不同的一级缓存
     *  2)同一个SqlSession但是查询条件不同
     *  3)同一个SqlSession两次查询期间执行了任何一次增删改操作
     *  4)同一个SqlSession两次查询期间手动清空了缓存
     */

    @Test
    public void getEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.getEmpById(1);
        System.out.println("emp = " + emp);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println("emp1 = " + emp1);
        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession.getMapper(CacheMapper.class);
        Emp emp2 = mapper.getEmpById(1);
        System.out.println("emp2 = " + emp2);
    }

    /**
     * 二级缓存测试
     * @throws IOException
     */
    @Test
    public void testCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(1);
        System.out.println("emp1 = " + emp1);
        sqlSession1.close();
        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpById(1);
        System.out.println("emp2 = " + emp2);
        sqlSession2.close();
    }
}
