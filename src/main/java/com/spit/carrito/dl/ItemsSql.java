package com.spit.carrito.dl;

import com.spit.carrito.controller.ItemService;
import com.spit.carrito.domain.Item;
import com.spit.carrito.domain.ItemR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class ItemsSql {
    @Service
    public class ItemSql implements ItemService {

        @Autowired
        private ItemR itemRepository;

        @Override
        public Item save(Item item) {
            return itemRepository.save(item);
        }

        @Override
        public Optional<Item> get(Integer id) {
            return itemRepository.findById(id);
        }

        @Override
        public void update(Item producto) {
            itemRepository.save(producto);
        }

        @Override
        public void delete(Integer id) {
            itemRepository.deleteById(id);
        }

        @Override
        public List<Item> findAll() {
            return itemRepository.findAll();
        }

    }
}
