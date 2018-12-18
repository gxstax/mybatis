package com.test;

import com.config.AppConfig;
import com.mapper.CityMapper;
import com.mylog.MyLog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ant
 * @ClassName: MybatisTest
 * @Description: Mybatis测试类
 * @datetime 2018/10/24 12:00
 * @Version 1.0
 */
public class MybatisTest {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(AppConfig.class);
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();

//        session.getConfiguration().setLogImpl(MyLog.class);

        try {
            CityMapper mapper = session.getMapper(CityMapper.class);
            System.out.println(mapper.query());
            System.out.println(mapper.query());
        } finally {
            session.close();
        }

    }
}
