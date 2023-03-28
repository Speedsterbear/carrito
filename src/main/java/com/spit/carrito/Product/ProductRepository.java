package com.spit.carrito.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product,Integer> {
    Product findFirstByCodigo(String Codigo);
}
