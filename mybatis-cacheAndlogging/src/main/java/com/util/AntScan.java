package com.util;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: AntScan
 * @Description: 自定义注解
 * @datetime 2018/12/4 9:18
 * @Version 1.0
 */
@Import(MyImportBeanDefinitionRegistrar.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface AntScan {

}
