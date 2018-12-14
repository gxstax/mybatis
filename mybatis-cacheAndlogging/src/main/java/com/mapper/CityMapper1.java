package com.mapper;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Update;

/**
 * @author Ant
 * @ClassName: CityMapper1
 * @Description: TODO
 * @datetime 2018/12/14 9:02
 * @Version 1.0
 */
@CacheNamespace
public interface CityMapper1 {

    @Update("update city set cityname = 'Beijing' where id = 1")
    void update();
}
