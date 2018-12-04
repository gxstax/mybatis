package com.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author gaoxx gxx@fxiaoke.com
 * @ClassName: CityDao
 * @Description: TODO
 * @datetime 2018/10/24 11:52
 * @Version 1.0
 */
public interface CityDao {

    @Select("select * from city where id = 1")
    List<Map<String, Object>> query();

}
