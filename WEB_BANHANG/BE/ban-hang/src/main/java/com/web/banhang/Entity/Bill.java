package com.web.banhang.Entity;

public class Bill {
    private int idOder;
    private int idProduct;
    private int quantity;

    public Bill() {
    }

    public Bill(int idOder, int idProduct, int quantity) {
        this.idOder = idOder;
        this.idProduct = idProduct;
        this.quantity = quantity;
    }

    public int getIdOder() {
        return idOder;
    }

    public void setIdOder(int idOder) {
        this.idOder = idOder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
