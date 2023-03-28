package com.spit.carrito.Cart;

import com.spit.carrito.Product.Product;

public class CartSet extends Product {
    private Float cantidad;

    public CartSet(String Pname,String Codigo, Float Price, Integer Stock, float cantidad) {
        super(Codigo,Pname,Price, Stock);
        this.cantidad = cantidad;
    }

    public void plusQuantity() {
        this.cantidad++;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public Float getTotal() {
        return this.getPrice() * this.cantidad;
    }
}

