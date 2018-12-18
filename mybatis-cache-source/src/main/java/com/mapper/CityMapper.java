package com.mapper;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @author Ant
 * @ClassName: CityMapper
 * @Description: TODO
 * @datetime 2018/10/24 11:52
 * @Version 1.0
 */
//@Mapper
//@CacheNamespace
public interface CityMapper {

    @Select("select * from city where id = 1")
    List<Map<String, Object>> query();

    @Update("update city set cityname = 'Beijing' where id = 1")
    void update();

}
