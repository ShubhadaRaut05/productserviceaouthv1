package com.shubhada.productservice.services;

import com.shubhada.productservice.dtos.ProductDTO;
import com.shubhada.productservice.models.Product;
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
    public SelfProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    public List<Product> getAllProducts() {


        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getSingleProduct(Long productId) {

        return Optional.of(productRepository.findProductById(productId));
    }

    @Override
    public Product addNewProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long productId, Product product) {

        Product existingProduct=productRepository.findProductById(productId);


        return null;
    }

    @Override
    public Product replaceProduct(Long productId, Product product) {

        return null;
    }

    @Override
    public Optional<Product> deleteProduct(Long productId) {
        Product product=productRepository.findProductById(productId);
     productRepository.deleteById(productId);
      return Optional.ofNullable(product);
       // return null;
    }
}
