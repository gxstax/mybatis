package com.config;

import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: AppConfig
 * @Description: 配置信息类
 * @datetime 2018/10/23 19:56
 * @Version 1.0
 */
//@AntScan
@Configuration
@ComponentScan("com")
@MapperScan("com.mapper")
//@PropertySource("classpath:/log4j.properties")
public class AppConfig {

    @Bean
    @Autowired
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        //添加Mybatis的日志打印
//        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
//        configuration.setLogImpl(Log4jImpl.class);
//        sqlSessionFactoryBean.setConfiguration(configuration);

        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }


    /**
     * c3p0
     * alibb dri
     * @return
     */
    @Bean
    public DataSource dataSource () {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mybatisTest");
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");

        return driverManagerDataSource;
    }
}
