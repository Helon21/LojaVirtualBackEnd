package com.example.backend.service;

import com.example.backend.entity.Brand;
import com.example.backend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> findAll(){
        return brandRepository.findAll();
    }

    public Brand insert(Brand brand){
        brand.setCreatedAt(new Date());
        Brand newBrand = new Brand();
        return brandRepository.saveAndFlush(brand);
    }

    public Brand update(Brand brand){
        brand.setUpdatedAt(new Date());
        return brandRepository.saveAndFlush(brand);
    }

    public void delete(Long id){
        Brand brand = brandRepository.findById(id).get();
        brandRepository.delete(brand);
    }

}
