package com.spit.carrito.Product;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class Product {
    @Id
    private Integer Id;


    private String Pname;


    private String Codigo;

    private Integer Stock;

    private Float Price;

    public Product(Integer id, String Pname, String Codigo, Float Price, Integer Stock) {
        this.Id = id;
        this.Codigo = Codigo;
        this.Pname = Pname;
        this.Price = Price;
        this.Stock = Stock;

    }

    public Product(String Pname, String Codigo, Float Price, Integer Stock) {
        this.Pname = Pname;
        this.Codigo = Codigo;
        this.Price = Price;
        this.Stock = Stock;
    }

    public Product(@NotNull(message = "Debes especificar el código") @Size(min = 1, max = 50, message = "El código debe medir entre 1 y 50") String codigo) {
        this.Codigo = codigo;
    }

    public Product() {

    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer Stock) {
        this.Stock = Stock;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float Price) {
        this.Price = Price;
    }
}
