package com.spit.carrito.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CartController {
    @Autowired private com.spit.carrito.Product.ProductService service;

    @GetMapping("/cart")
    public String showProductList(Model model) {
        List<Product> listcarts = service.listAll();
        model.addAttribute("listcart", listcarts);

        return "carts";
    }
}
