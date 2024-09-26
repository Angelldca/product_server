package com.angelldca.product_service.service;


import com.angelldca.product_service.mapper.ProductDtoToProduct;
import com.angelldca.product_service.persistence.Entity.Category;
import com.angelldca.product_service.persistence.Entity.Product;
import com.angelldca.product_service.persistence.Repository.ProductRepository;
import com.angelldca.product_service.publisher.Publisher;
import com.angelldca.product_service.service.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService{

    private final ProductRepository productRepository;
    private final ProductDtoToProduct mapper;
    private final Publisher publisher;

    public ProductService(ProductRepository productRepository, ProductDtoToProduct mapper, Publisher publisher) {
        this.productRepository = productRepository;
        this.mapper = mapper;
        this.publisher = publisher;
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

    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }

    public Object messageRabit(String msg){
        Category category = new Category(1L,"Plomeria");
        return publisher.send(category);
    }
}
