package com.angelldca.product_service.controller;


import com.angelldca.product_service.persistence.Entity.Product;
import com.angelldca.product_service.service.ProductService;
import com.angelldca.product_service.service.dto.ProductDto;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.list();
    }
    @PostMapping
    public Product createProduct(@RequestBody ProductDto p){
        return productService.createProduct(p);
    }
    @DeleteMapping
    public void deleteProduct (@PathVariable("id") Long id){
         productService.delete(id);
    }


    @GetMapping("/msg")
    public Object sendRabbit(){
        return productService.messageRabit("mensaje enviado desde el servicio product");
    }

}
