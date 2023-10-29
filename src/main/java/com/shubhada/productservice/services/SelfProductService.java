package com.shubhada.productservice.services;

import com.shubhada.productservice.dtos.ProductDTO;
import com.shubhada.productservice.models.Product;
import com.shubhada.productservice.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

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
        return Optional.empty();
    }

    @Override
    public Product addNewProduct(ProductDTO product) {
        return null;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public Optional<Product> deleteProduct(Long productId) {
        return Optional.empty();
    }
}
