package com.angelldca.product_service.service.dto;

import com.angelldca.product_service.persistence.Entity.Category;
import com.angelldca.product_service.persistence.Entity.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

public class ProductDto {
    private String name;
    private Set<Category> categories;
    private int stock;
    private double wheight;
    private String image;
    private String descriptions;
    private double price;
    private Status status;

    public ProductDto(String name,String descriptions, Set<Category> categories, int stock, double wheight, String image, double price, Status status) {
        this.name = name;
        this.categories = categories;
        this.stock = stock;
        this.wheight = wheight;
        this.image = image;
        this.price = price;
        this.status = status;
        this.descriptions= descriptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getWheight() {
        return wheight;
    }

    public void setWheight(double wheight) {
        this.wheight = wheight;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
