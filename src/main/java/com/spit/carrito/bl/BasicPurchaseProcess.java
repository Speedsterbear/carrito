package com.spit.carrito.bl;

import com.spit.carrito.dl.ItemRepository;
import com.spit.carrito.domain.ShoppingCart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class BasicPurchaseProcess implements PurchaseProcess {
 
    // Repositories
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ShoppingCart shoppingCart;

    public BasicPurchaseProcess() {
        this.shoppingCart = new ShoppingCart();
    }

    @Override
    public void AddItemToCart(Integer itemId, BigDecimal quantity) {
        var item = itemRepository.findItem(itemId);
        this.shoppingCart.AddItemToCart(item, quantity);
    }

    @Override
    public void RemoveItemFromCart(Integer itemId, BigDecimal quantity) {
        if (quantity.compareTo(BigDecimal.ZERO) == 0) {
            return;
        }
        var currentQuantity = this.shoppingCart.GetItemQuantity(itemRepository.findItem(itemId));
        if (currentQuantity.compareTo(quantity) <= 0) {
            this.shoppingCart.RemoveItemFromCart(itemRepository.findItem(itemId));
        } else if (currentQuantity.compareTo(quantity) > 0) {
            this.shoppingCart.UpdateItemInCart(itemRepository.findItem(itemId), currentQuantity.subtract(quantity));
        } 
    }

}
