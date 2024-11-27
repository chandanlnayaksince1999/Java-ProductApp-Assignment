package com.bosch.productapp.service;

import com.bosch.productapp.exception.NoProductFoundException;
import com.bosch.productapp.exception.ProductException;
import com.bosch.productapp.model.Product;

import java.util.List;

public interface ProductService {

    int addProduct(Product product) throws ProductException;
    boolean updateProduct(int id, Product product) throws ProductException;
    boolean deleteProduct(int id) throws ProductException;
    Product viewProduct(int id) throws ProductException;
    List<Product> viewAllProducts();
    void printStatistics();
    boolean importProducts();
    boolean exportProducts();
}
