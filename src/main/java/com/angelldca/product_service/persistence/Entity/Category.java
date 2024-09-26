package com.angelldca.product_service.persistence.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_category;
    @NotNull(message = "Name of category may not be null")
    @NotEmpty (message = "Name of category may not be empty")
    private String name;

  //  @ManyToMany(mappedBy = "categories")  // indicar que la entidad product maneja
                                          // relacion
   // private Set<Product> products;
}
