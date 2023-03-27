package com.spit.carrito.Product;

import jakarta.persistence.*;


@Entity
@Table(name = "sc")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(length = 255, nullable = false, name = "productId")
    private Integer productId;

    @Column(length = 255, nullable = false, name = "Pname")
    private String Pname;
    @Column(length = 255, nullable = false, name = "Quantity")
    private Integer Quantity;



    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }



    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }





    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Pname='" + productId + '\'' +
                ", Stock='" + Pname + '\'' +
                ", Price='" + Quantity + '\'' +
                '}';
    }
}