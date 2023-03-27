package com.spit.carrito.SC;

import com.spit.carrito.Product.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired private CartRepository repo;

        public List<Cart> listAll() {
        return (List<Cart>) repo.findAll();
    }
}
