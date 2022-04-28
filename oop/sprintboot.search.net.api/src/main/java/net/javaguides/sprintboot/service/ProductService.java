package net.javaguides.sprintboot.service;

import net.javaguides.sprintboot.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
