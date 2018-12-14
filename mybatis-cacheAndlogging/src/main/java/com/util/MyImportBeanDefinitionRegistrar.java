package com.util;

import com.mapper.CityMapper;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;


/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: MyImportBeanDefinitionRegistrar
 * @Description: 造轮子，模拟mybatis
 * @datetime 2018/12/4 8:13
 * @Version 1.0
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        /*
         * 1.得到BD,mybatis是扫描得到，我们这边测试方便直接写死
         */
        //CityMapper mapper = (CityMapper) Proxy.newProxyInstance(MybatisTest.class.getClassLoader(), new Class[]{CityMapper.class}, new MyInvocationHandler());
        //mapper.query();
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CityMapper.class);
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
        //2.使用bd的特性直接给class新增加一个构造方法
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.mapper.CityMapper");
        /**
         * 3.为了能够动态处理，我们这边使用FactoryBean,动态处理类对象
         */
        beanDefinition.setBeanClass(MyFactoryBean.class);
        /**
         * 4.使用spring的注册器我们的生成的类对象放入到map中，交给我么spring管理
         */
        registry.registerBeanDefinition("cityMapper", beanDefinition);
    }
}
