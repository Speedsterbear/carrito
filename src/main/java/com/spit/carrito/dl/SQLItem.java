package com.spit.carrito.dl;

import com.spit.carrito.domain.Item;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class SQLItem implements ItemRepository{
    @Override
    public Item findItem(int itemId) {
        return null;
    }

    @Override
    public Item addItem(Item item) {
        return null;
    }

    @Override
    public Item updateItem(Item item) {
        return null;
    }

    @Override
    public Item deleteItem(int itemId) {
        return null;
    }
}
