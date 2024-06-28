package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.CacheMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ZJ
 * @ClassName PageTest
 * @Description TODO
 * @date 2024/6/28 22:30
 * @Version 1.0
 */
public class PageTest {

    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        // 查询功能开启之前开启分页功能
        Page<Object> page = PageHelper.startPage(1, 2);
        List<Emp> emps = mapper.selectAllEmp();
        // 查询功能之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<Emp>(emps,2);

    }
}
