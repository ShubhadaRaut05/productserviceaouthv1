package com.shubhada.productservice.services;

import com.shubhada.productservice.dtos.ProductDTO;
import com.shubhada.productservice.exceptions.NotFoundException;
import com.shubhada.productservice.models.Category;
import com.shubhada.productservice.models.Product;
import com.shubhada.productservice.repositories.CategoryRepository;
import com.shubhada.productservice.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class SelfProductService implements ProductService{
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    public SelfProductService(ProductRepository productRepository,CategoryRepository categoryRepository){
        this.productRepository=productRepository;
        this.categoryRepository=categoryRepository;
    }
    @Override
    public List<Product> getAllProducts() {


        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getSingleProduct(Long productId) throws NotFoundException {

        Optional<Product> productOptional= Optional.ofNullable(Optional.ofNullable(productRepository.findProductById(productId))
                .orElseThrow(() -> new NotFoundException("Does not found product with id: " + productId)));
        return Optional.of(productRepository.findProductById(productId));
    }

    @Override
    public Product addNewProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long productId, Product product) throws NotFoundException {

        Optional<Product> productOptional= Optional.ofNullable(Optional.ofNullable(productRepository.findProductById(productId))
                .orElseThrow(() -> new NotFoundException("Does not found product with id: " + productId)));
        return productRepository.save(product);

    }

    @Override
    public Product replaceProduct(Long productId, Product product) throws NotFoundException {

        Optional<Product> productOptional= Optional.ofNullable(Optional.ofNullable(productRepository.findProductById(productId))
                .orElseThrow(() -> new NotFoundException("Does not found product with id: " + productId)));
        return productRepository.save(product);

    }
    @Override
    public Optional<Product> deleteProduct(Long productId) throws NotFoundException {
        Optional<Product> productOptional= Optional.ofNullable(Optional.ofNullable(productRepository.findProductById(productId))
                .orElseThrow(() -> new NotFoundException("Does not found product with id: " + productId)));
        Product product=productRepository.findProductById(productId);
     productRepository.deleteById(productId);
      return Optional.ofNullable(product);
       // return null;
    }
}
