package com.angelldca.product_service;


import com.angelldca.product_service.persistence.Entity.Category;
import com.angelldca.product_service.persistence.Entity.Product;
import com.angelldca.product_service.persistence.Entity.Status;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTestUnit {

    @Test
    public void testProductGetAndSet(){
        Set<Category> categories = new HashSet<Category>();
        categories.add(new Category(1L, "Electronic"));
        LocalDateTime now = LocalDateTime.now();
        Product product = new Product();
        product.setId_product(1L);
        product.setName("Laptop");
        product.setCategories(categories);
        product.setPrice(1500.0);
        product.setStock(50);
        product.setWheight(2.5);
        product.setImage("laptop.jpg");
        product.setDescriptions("High performance laptop");
        product.setStatus(Status.DISPONIBLE);
        product.setQualification(4.5f);
        product.setCreateAt(now);


        //Asserts

        // Assert that the getters return the expected values
        assertThat(product.getId_product()).isEqualTo(1L);
        assertThat(product.getName()).isEqualTo("Laptop");
        assertThat(product.getCategories()).isEqualTo(categories);
        assertThat(product.getPrice()).isEqualTo(1500.0);
        assertThat(product.getStock()).isEqualTo(50);
        assertThat(product.getWheight()).isEqualTo(2.5);
        assertThat(product.getImage()).isEqualTo("laptop.jpg");
        assertThat(product.getDescriptions()).isEqualTo("High performance laptop");
        assertThat(product.getStatus()).isEqualTo(Status.DISPONIBLE);
        assertThat(product.getQualification()).isEqualTo(4.5f);
        assertThat(product.getCreateAt()).isEqualTo(now);
    }
}
