package com.web.banhang.Entity;

public class Evaluate {
    private int idUser;
    private int idProduct;
    private int star;

    public Evaluate() {
    }

    public Evaluate(int idUser, int idProduct, int star) {
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.star = star;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
