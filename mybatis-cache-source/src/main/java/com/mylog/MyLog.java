package com.mylog;

import org.apache.ibatis.logging.Log;

import java.util.logging.Logger;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: MyLog
 * @Description: 修改MyBatis日志级别,重新定义jul日志级别
 * @datetime 2018/12/17 20:34
 * @Version 1.0
 */
public class MyLog implements Log{

    Logger logger ;

    public MyLog(String logger) {
        this.logger = Logger.getLogger("Ant");
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public void error(String s, Throwable e) {

    }

    @Override
    public void error(String s) {

    }

    @Override
    public void debug(String s) {
        logger.info(s);
    }

    @Override
    public void trace(String s) {

    }

    @Override
    public void warn(String s) {

    }
}
