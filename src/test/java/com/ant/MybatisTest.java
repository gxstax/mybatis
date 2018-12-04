package com.ant;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: MybatisTest
 * @Description: TODO
 * @datetime 2018/10/23 14:31
 * @Version 1.0
 */

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectUser("1");

//        User user = sqlSession.selectOne("com.ant.UserMapper.selectUser", "1");

        System.out.println(user);
    }

}
