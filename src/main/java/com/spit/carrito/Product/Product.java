package com.spit.carrito.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;



@Entity
@Table(name = "Inventory")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(length = 255, nullable = false, name = "Pname")
    private String Pname;

    @Column(length = 255, nullable = false, name = "Stock")
    private Integer Stock;
    @Column(length = 255, nullable = false, name = "Price")
    private Double Price;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
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

    public void setStock(Integer Quantity) {
        this.Stock = Quantity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Pname='" + Pname + '\'' +
                ", Stock='" + Stock + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}