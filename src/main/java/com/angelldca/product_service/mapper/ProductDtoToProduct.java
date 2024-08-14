package com.angelldca.product_service.mapper;

import com.angelldca.product_service.persistence.Entity.Product;
import com.angelldca.product_service.service.dto.ProductDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class ProductDtoToProduct implements IMapper<ProductDto, Product>{
    @Override
    public Product map(ProductDto i) {
        Product product = new Product();
        product.setName(i.getName());
        product.setPrice(i.getPrice());
        product.setCategories(i.getCategories());
        product.setStatus(i.getStatus());
        product.setQualification(0);
        product.setWheight(i.getWheight());
        product.setDescriptions(i.getDescriptions());
        product.setImage(product.getImage());
        product.setCreateAt(LocalDateTime.now());

        return product;
    }
}
