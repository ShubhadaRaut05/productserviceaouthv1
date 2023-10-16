package com.shubhada.productservice.repositories;

import com.shubhada.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category save(Category category);

}
