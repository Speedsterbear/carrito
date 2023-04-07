package com.spit.carrito.bl;

import java.math.BigDecimal;

public interface PurchaseProcess {
    
    public void AddItemToCart(Integer itemId, BigDecimal quantity);


    public void RemoveItemFromCart(Integer itemId, BigDecimal quantity);

}
