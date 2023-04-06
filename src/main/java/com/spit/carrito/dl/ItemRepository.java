package com.spit.carrito.dl;

import com.spit.carrito.domain.Item;


public interface ItemRepository {
    public Item findItem(int itemId);
    
    public Item addItem(Item item);

    public Item updateItem(Item item);

    public Item deleteItem(int itemId);

}
