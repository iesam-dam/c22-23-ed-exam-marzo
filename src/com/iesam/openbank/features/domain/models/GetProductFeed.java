package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.Producto;

public class GetProductFeed {

    private ProductRepository productRepository;

    public GetProductFeed(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Producto execute(String idProduct){
        return this.productRepository.obtainProduct(idProduct);
    }
}
