package com.angelldca.product_service.persistence.Repository;

import com.angelldca.product_service.persistence.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
