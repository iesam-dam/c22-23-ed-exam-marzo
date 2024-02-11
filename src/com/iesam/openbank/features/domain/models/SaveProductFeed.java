package com.iesam.openbank.features.domain.models;


import com.iesam.openbank.features.domain.Producto;

public class SaveProductFeed {

    private ProductRepository productRepository;

    public SaveProductFeed(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void execute(Producto producto){
        this.productRepository.saveProduct(producto);
    }
}
