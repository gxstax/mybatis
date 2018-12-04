package com.util;

import com.dao.CityDao;
import com.test.MybatisTest;
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
        //CityDao dao = (CityDao) Proxy.newProxyInstance(MybatisTest.class.getClassLoader(), new Class[]{CityDao.class}, new MyInvocationHandler());
        //dao.query();
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CityDao.class);
//        builder.addConstructorArgReference("cityDao");
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
        System.out.println(beanDefinition.getBeanClass().getName());
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.dao.CityDao");
        beanDefinition.setBeanClass(MyFactoryBean.class);
        registry.registerBeanDefinition("cityDao", beanDefinition);
    }
}
