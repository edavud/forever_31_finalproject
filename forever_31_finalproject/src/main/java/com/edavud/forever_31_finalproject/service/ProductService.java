package com.edavud.forever_31_finalproject.service;

import com.edavud.forever_31_finalproject.repository.entity.Product;
import com.edavud.forever_31_finalproject.repository.entity.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository )
    {
        this.productRepository = productRepository;
    }

    public Product save(Product product )
    {

        return productRepository.save(product);

    }

    public void delete( int productId )
    {
        productRepository.deleteById(productId);
    }


    public List<Product> all()
    {
        return productRepository.findAll();
    }


    public Optional<Product> findById(int productId )
    {

        return productRepository.findById(productId);
    }


}
