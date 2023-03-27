package com.spit.carrito;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
        public  String sHome(){
        return "index";
    }

}
