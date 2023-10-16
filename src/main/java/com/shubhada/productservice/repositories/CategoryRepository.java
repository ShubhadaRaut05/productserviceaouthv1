package com.shubhada.productservice.repositories;

import com.shubhada.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category save(Category category);
    List<Category> findAllByIdIn(List<Long> ids);

}
