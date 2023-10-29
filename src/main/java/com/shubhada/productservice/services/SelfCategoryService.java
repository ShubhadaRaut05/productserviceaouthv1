package com.shubhada.productservice.services;

import com.shubhada.productservice.dtos.CategoryDTO;
import com.shubhada.productservice.models.Product;

import java.util.List;

public class SelfCategoryService implements CategoryService {
    @Override
    public List<CategoryDTO> getAllCategories() {
        return null;
    }

    @Override
    public List<Product> getProductsInCategory(String Category) {
        return null;
    }
}
