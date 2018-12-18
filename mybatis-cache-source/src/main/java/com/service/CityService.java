package com.service;

import com.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: CityService
 * @Description: MybatisService
 * @datetime 2018/10/24 14:16
 * @Version 1.0
 */
@Service
public class CityService {

    @Autowired
    public CityMapper cityMapper;

//    @Autowired
//    public CityMapper1 cityMapper1;

    public void query() {
        List<Map<String, Object>> cityLst = cityMapper.query();
        System.out.println(cityLst.toString());
    }

    public void update() {
        cityMapper.update();
    }
}
