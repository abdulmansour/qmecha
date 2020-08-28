package io.backend.qmecha.services;

import io.backend.qmecha.entites.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product getProductById(int id);
}
