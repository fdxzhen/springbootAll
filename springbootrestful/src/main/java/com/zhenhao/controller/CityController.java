package com.zhenhao.controller;

import com.zhenhao.bean.City;
import com.zhenhao.service.CityService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@MapperScan("com.zhenhao.dao")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city/{id}",method = RequestMethod.GET)
    public City FindOneCity(@PathVariable("id") Long id){
        return cityService.findById(id);
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.GET)
    public List<City> findAllCity(){
        return cityService.findAllCity();
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.POST)
    public void moodifyCity(@RequestBody City city){
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
