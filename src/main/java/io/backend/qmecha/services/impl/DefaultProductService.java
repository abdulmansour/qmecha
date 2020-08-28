package io.backend.qmecha.services.impl;

import io.backend.qmecha.entites.Product;
import io.backend.qmecha.exceptions.ProductNotFoundException;
import io.backend.qmecha.repositories.ProductRepository;
import io.backend.qmecha.services.ProductService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultProductService implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found for id: " + id));
    }
}
