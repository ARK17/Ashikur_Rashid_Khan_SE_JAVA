package com.ark.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        List<Product>products= new ArrayList<>();
        productRepository.findAll().forEach(products::add); //find all returns an iterable and I'm iterating over all products and adding them in products list
        return products;
    }
    public Product getProduct(String productCode){
        return productRepository.findOne(productCode);
    }
    public void addProduct(Product product){
        productRepository.save(product);
    }
    public void updateProduct(String productCode, Product product){
        productRepository.save(product);
    }

    public void deleteProduct(String productCode) {
        productRepository.delete(productCode);
    }
}
