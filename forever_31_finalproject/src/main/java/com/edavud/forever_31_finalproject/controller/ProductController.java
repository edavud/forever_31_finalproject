package com.edavud.forever_31_finalproject.controller;

import com.edavud.forever_31_finalproject.controller.dto.ProductDto;
import com.edavud.forever_31_finalproject.repository.entity.Product;
import com.edavud.forever_31_finalproject.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/product/all")
    public List<Product> getProducts(){
        return productService.all();
    }

    @PostMapping
    public Product save(@RequestBody ProductDto productDto) {
        return productService.save(new Product(productDto));
    }

    @GetMapping("/{id}")
    public Optional<Product> findProductById(@PathVariable Integer id ){
        return productService.findById( id );
    }

    @PutMapping( "/{id}" )
    public Product update( @RequestBody ProductDto productDto, @PathVariable Integer id )
    {
        Optional<Product> product  = productService.findById( id );
        product.setName( productDto.getName() );
        product.setDescription( productDto.getDescription() );
        product.setImageUrl( productDto.getImgUrl() );
        return productService.save( product );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        productService.delete( id );
    }
}
