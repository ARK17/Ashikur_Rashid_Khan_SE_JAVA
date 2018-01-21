package com.ark.products;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @Id
    private String productCode; // Primary key
    private String name;
    private String productType;
    private int quantity;
    private double price;
    private double profitPercentage;
    private String description;

    public Product() {
    }
    public Product(String productCode,String name, String productType, int quantity,double price, double profitPercentage, String description) {
        this.productCode = productCode;
        this.name = name;
        this.productType = productType;
        this.quantity = quantity;
        this.price = price;
        this.profitPercentage = profitPercentage;
        this.description = description;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProfitPercentage() {
        return profitPercentage;
    }

    public void setProfitPercentage(double profitPercentage) {
        this.profitPercentage = profitPercentage;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
