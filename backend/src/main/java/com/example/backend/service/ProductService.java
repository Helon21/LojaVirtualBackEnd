package com.example.backend.service;

import com.example.backend.entity.Product;
import com.example.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product insert(Product product){
        product.setCreationDate(new Date());
        Product newProduct = new Product();
        return productRepository.saveAndFlush(product);
    }

    public Product update(Product product){
        product.setUpdateDate(new Date());
        return productRepository.saveAndFlush(product);
    }

    public void delete(Long id){
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
    }

}
