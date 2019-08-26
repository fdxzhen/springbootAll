package com.zhenhao.dao;

import com.zhenhao.bean.City;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CityDao {

    @Select("select id, province_id, city_name, description from city ")
    @Results(id="cityMap",value={
            @Result(property = "id", column = "id", javaType = Long.class,id=true),
            @Result(property = "provinceId", column = "province_id", javaType = Long.class),
            @Result(property = "cityName", column = "city_name", javaType = String.class),
            @Result(property = "description", column = "description", javaType = String.class)
    })
    List<City> findAllCity();

    @Select("select * from city where id=#{id}")
    @ResultMap(value = "cityMap")
    City findById(@Param("id") Long id);

    @Insert("insert into city values(#{id},#{provinceId},#{cityName},#{description})")
    Long saveCity(City city);

    @Update("update city set province_id= #{provinceId}, city_name=#{cityName},description =#{description} where id=#{id}")
    Long updateCity(City city);

    @Delete("delete from city where id=#{id}")
    Long deleteCity(Long id);

}
