package com.ant;

import org.apache.ibatis.annotations.Param;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: UserMapper
 * @Description: TODO
 * @datetime 2018/10/23 14:31
 * @Version 1.0
 */
public interface UserMapper {
    User selectUser(@Param("id") String id);

    User selectUsers();
}
