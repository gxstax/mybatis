package com.test;

import com.config.AppConfig;
import com.mapper.CityMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ant
 * @ClassName: MybatisTest
 * @Description: Mybatis测试类
 * @datetime 2018/10/24 12:00
 * @Version 1.0
 */
public class MybatisCacheTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(AppConfig.class);
        CityMapper mapper = act.getBean(CityMapper.class);
        System.out.println(mapper.query());

    }
}
