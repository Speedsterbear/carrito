package com.spit.carrito.SC;

import com.spit.carrito.Product.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository <Cart,Integer> {
}
