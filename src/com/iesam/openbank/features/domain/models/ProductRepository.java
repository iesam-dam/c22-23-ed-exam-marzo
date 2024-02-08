package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.Producto;

public interface ProductRepository {


    Producto obtainProduct(String idProduct);
    void saveProduct(Producto product);

}
