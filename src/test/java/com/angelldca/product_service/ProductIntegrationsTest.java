package com.angelldca.product_service;


import com.angelldca.product_service.persistence.Entity.Product;
import com.angelldca.product_service.persistence.Repository.ProductRepository;
import com.angelldca.product_service.service.ProductService;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.Mockito.when;

public class ProductIntegrationsTest {
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testFindProductById() {
        // Arrange
        Product mockProduct = new Product();
        mockProduct.setId_product(1L);
        mockProduct.setName("Test Product");

        when(productRepository.findById(1L)).thenReturn(Optional.of(mockProduct));

        // Act
        Optional<Product> foundProduct = productService.findById(1L);

        // Assert
        assertThat(foundProduct).isPresent();
        assertThat(foundProduct.get().getName()).isEqualTo("Test Product");

        verify(productRepository, times(1)).findById(1L);
    }


}
