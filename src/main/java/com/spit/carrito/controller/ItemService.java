package com.spit.carrito.controller;

import com.spit.carrito.domain.Item;

import java.util.List;
import java.util.Optional;
public interface ItemService {

        public Item save( Item item);
        public Optional<Item> get(Integer id);
        public void update(Item item);
        public void delete(Integer id);
        public List<Item> findAll();

}
