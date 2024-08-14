package com.angelldca.product_service.service;


import com.angelldca.product_service.mapper.ProductDtoToProduct;
import com.angelldca.product_service.persistence.Entity.Product;
import com.angelldca.product_service.persistence.Repository.ProductRepository;
import com.angelldca.product_service.service.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{

    private final ProductRepository productRepository;
    private final ProductDtoToProduct mapper;

    public ProductService(ProductRepository productRepository, ProductDtoToProduct mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

   public Product createProduct(ProductDto p){
        return productRepository.save(mapper.map(p));
   }
    public List<Product> list(){
        return productRepository.findAll();
    }
    public void delete(Long id){
         productRepository.deleteById(id);
    }

}
