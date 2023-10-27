package com.shubhada.productservice.repositories;

import com.shubhada.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
   Product save(Product product);
   Product findProductById(Long id);
   List<Product> findByTitleStartingWith(String title);
   //findByTitleLike(title+"%")
   List<Product> findByTitleLike(String titleLike);
}
