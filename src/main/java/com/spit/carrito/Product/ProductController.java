package com.spit.carrito.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    private ProductRepository productsRepository;
    @Autowired private com.spit.carrito.Product.ProductService service;
    @GetMapping(value = "/agregar")
    public String agregarProducto(Model model) {
        model.addAttribute("producto", new Product());
        return "productos/agregar_producto";
    }

    @GetMapping(value = "/mostrar")
    public String mostrarProductos(Model model) {
        model.addAttribute("products", productsRepository.findAll());
        return "productos/ver_productos";
    }
}
