package com.haroldaltaq.store.product.service;

import com.haroldaltaq.store.product.entity.Category;
import com.haroldaltaq.store.product.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    public Product getProduct(Long id);
    public List<Product> listAllProduct();

    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public Product updateStock(Long id, Double quantity);
    public Product deleteProduct(Long id);

    public List<Product> findByCategory(Category category);
}
