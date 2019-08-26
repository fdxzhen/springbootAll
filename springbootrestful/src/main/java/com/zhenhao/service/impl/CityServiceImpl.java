package com.zhenhao.service.impl;

import com.zhenhao.bean.City;
import com.zhenhao.dao.CityDao;
import com.zhenhao.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {


    @Autowired
    private CityDao cityDao;


    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public City findById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityDao.deleteCity(id);
    }
}
