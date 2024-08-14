package com.angelldca.product_service.persistence.Repository;

import com.angelldca.product_service.persistence.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
