package com.shubhada.productservice;

import com.shubhada.productservice.models.Category;
import com.shubhada.productservice.models.Product;
import com.shubhada.productservice.repositories.CategoryRepository;
import com.shubhada.productservice.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductTests {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Test
    void savingProductAndCategory(){
      /*  Category category=new Category();
        category.setName("phones");
        Category savedCategory=categoryRepository.save(category);

        Product product=new Product();
        product.setPrice(100);
        product.setTitle("iPhone17");
        product.setDescription("iPhone17 launching soon");
        product.setImageUrl("hello");
        product.setCategory(category);
        productRepository.save(product);*/

        Category category=new Category();
        category.setName("electronics");
        //Category savedCategory=categoryRepository.save(category);

        Product product=new Product();
        product.setPrice(101);
        product.setTitle("TV");
        product.setDescription("LED TV");
        product.setImageUrl("ledtv");
        product.setCategory(category);
        productRepository.save(product);
    }
    @Test
    @Transactional
    void fetchTypesTests(){
     Product product=productRepository.findProductById(1L);
        System.out.println("fetched product");
        Category category=product.getCategory();
        String name=category.getName();
    }
    @Test
    void deleteProduct(){
     productRepository.deleteById(1L);
    }
}
