package net.javaguides.sprintboot.repository;

import net.javaguides.sprintboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%', :query, '%')" +
            "p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);
}
