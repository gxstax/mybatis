package com.service;

import com.mapper.CityDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: CityService
 * @Description: MybatisService
 * @datetime 2018/10/24 14:16
 * @Version 1.0
 */

public class CityService {

    @Autowired
    public CityDao cityDao;

    public void query() {
        List<Map<String, Object>> cityLst = cityDao.query();
        System.out.println(cityLst.toString());
    }
}
