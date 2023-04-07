package com.spit.carrito.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemR extends JpaRepository<Item,Integer> {
}
