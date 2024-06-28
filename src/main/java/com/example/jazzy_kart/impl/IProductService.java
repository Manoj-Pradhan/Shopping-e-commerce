package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.Product;

import java.util.List;

public interface IProductService {

    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product updateProduct(Long id, Product productDetails);

    void deleteProduct(Long id);
}
