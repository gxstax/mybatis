package com.test;

import com.config.AppConfig;
import com.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Ant
 * @ClassName: MybatisTest
 * @Description: Mybatis测试类
 * @datetime 2018/10/24 12:00
 * @Version 1.0
 */
public class MybatisTest {
    public static void main(String[] args) {
//        CityMapper mapper = (CityMapper) Proxy.newProxyInstance(MybatisTest.class.getClassLoader(), new Class[]{CityMapper.class}, new MyInvocationHandler());
//        mapper.query();

        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(AppConfig.class);
        //第一次查询
        CityService service = act.getBean(CityService.class);
        service.query();
        //修改
        CityService service1 = act.getBean(CityService.class);
        service1.update();
        //第二次查询
        CityService service2 = act.getBean(CityService.class);
        service2.query();
    }
}
