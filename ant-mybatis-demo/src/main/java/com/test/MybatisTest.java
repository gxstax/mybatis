package com.test;

import com.config.AppConfig;
import com.mapper.CityDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: MybatisTest
 * @Description: Mybatis测试类
 * @datetime 2018/10/24 12:00
 * @Version 1.0
 */
public class MybatisTest {
    public static void main(String[] args) {
//        CityDao mapper = (CityDao) Proxy.newProxyInstance(MybatisTest.class.getClassLoader(), new Class[]{CityDao.class}, new MyInvocationHandler());
//        mapper.query();
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(AppConfig.class);
        CityDao dao = (CityDao) act.getBean("cityDao");
        dao.query();
//        cityService.query();
    }
}
