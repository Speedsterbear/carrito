package com.spit.carrito.Cart;

import com.spit.carrito.Product.Product;
import com.spit.carrito.Product.ProductRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
public class CartController{
    @Autowired
    private ProductRepository productsRepository;



    @PostMapping(value = "/quitar/{indice}")
    public String quitarDelCarrito(@PathVariable int indice, HttpServletRequest request) {
        ArrayList<CartSet> carrito = this.obtenerCarrito(request);
        if (carrito != null && carrito.size() > 0 && carrito.get(indice) != null) {
            carrito.remove(indice);
            this.guardarCarrito(carrito, request);
        }
        return "redirect:/vender/";
    }
    @GetMapping(value = "/")
    public String interfazVender(Model model, HttpServletRequest request) {
        model.addAttribute("product", new Product());
        float total = 0;
        ArrayList<CartSet> carrito = this.obtenerCarrito(request);
        for (CartSet p: carrito) total += p.getTotal();
        model.addAttribute("total", total);
        return "vender/vender";
    }

    private ArrayList<CartSet>obtenerCarrito(HttpServletRequest request){
        ArrayList<CartSet> carrito = (ArrayList<CartSet>) request.getSession().getAttribute("carrito");
        if (carrito == null) {
            carrito = new ArrayList<>();
        }
        return carrito;
    }

    private void guardarCarrito(ArrayList<CartSet> carrito, HttpServletRequest request) {
        request.getSession().setAttribute("carrito", carrito);
    }

    @PostMapping(value = "/agregar")
    public String agregarAlCarrito(@ModelAttribute Product product, HttpServletRequest request, RedirectAttributes redirectAttrs) {
        ArrayList<CartSet> carrito = this.obtenerCarrito(request);
        Product productoBuscadoPorCodigo = productsRepository.findFirstByCodigo(product.getCodigo());
        boolean encontrado = false;
        for (CartSet cartSet : carrito) {
            if (cartSet.getCodigo().equals(cartSet.getCodigo())) {
                cartSet.plusQuantity();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            carrito.add(new CartSet(productoBuscadoPorCodigo.getPname(), productoBuscadoPorCodigo.getCodigo(), productoBuscadoPorCodigo.getPrice(),productoBuscadoPorCodigo.getStock(),1f));
        }
        this.guardarCarrito(carrito, request);
        return "redirect:/vender/";
    }
}

