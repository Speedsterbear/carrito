package com.spit.carrito;

import com.spit.carrito.Product.Product;
import com.spit.carrito.Product.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class CarrionApplicationTests {
    @Autowired private ProductRepository repo;

    @Test
    public void testListAll() {
        Iterable<Product> products = repo.findAll();
        Assertions.assertThat(products).hasSizeGreaterThan(0);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}