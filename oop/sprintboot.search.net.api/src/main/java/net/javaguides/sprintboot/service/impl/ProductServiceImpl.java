package net.javaguides.sprintboot.service.impl;

import net.javaguides.sprintboot.repository.ProductRepository;
import net.javaguides.sprintboot.service.ProductService;
import net.javaguides.sprintboot.entity.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}

