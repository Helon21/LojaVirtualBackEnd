package com.example.backend.service;

import com.example.backend.entity.City;
import com.example.backend.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll(){
        return cityRepository.findAll();
    }
    public City insert(City city){
        City newCity = cityRepository.saveAndFlush(city);
        return newCity;
    }

    public City update(City city){
        return cityRepository.saveAndFlush(city);
    }

    public void delete(Long id){
        City city = cityRepository.findById(id).get();
        cityRepository.delete(city);
    }

}
