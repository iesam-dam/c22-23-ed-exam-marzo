package com.iesam.openbank.features.data;

import com.iesam.openbank.features.domain.models.ProductRepository;
import com.iesam.openbank.features.domain.Producto;

import java.util.ArrayList;

public class ProductDataRepository implements ProductRepository {

    private ArrayList<Producto> localProducts = new ArrayList<>();
    private static ProductDataRepository instance = null;

    public static ProductDataRepository newInstance() {
        if (instance == null)
            instance = new ProductDataRepository();
        return instance;
    }

    @Override
    public Producto obtainProduct(String idProduct) {
        for (Producto producto: localProducts)
            if (producto.getId().equals(idProduct))
                return producto;
        return null;
    }

    @Override
    public void saveProduct(Producto product) {
        localProducts.add(product);
    }
}
