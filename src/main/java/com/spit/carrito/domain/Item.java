package com.spit.carrito.domain;

import java.math.BigDecimal;

public record Item (Integer itemId, String name, BigDecimal price){
}
