package org.example.dynamicmenu.Services;

import lombok.RequiredArgsConstructor;
import org.example.dynamicmenu.Entities.Product;
import org.example.dynamicmenu.Repositories.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final IProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void createProduct(Product product) {
        productRepository.save(product);
    }

}
