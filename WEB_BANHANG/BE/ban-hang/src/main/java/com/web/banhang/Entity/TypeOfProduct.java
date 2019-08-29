package com.web.banhang.Entity;

public class TypeOfProduct {
    private int idTypeOfProduct;
    private String typeOfProduct;

    public TypeOfProduct() {
    }

    public TypeOfProduct(int idTypeOfProduct, String typeOfProduct) {
        this.idTypeOfProduct = idTypeOfProduct;
        this.typeOfProduct = typeOfProduct;
    }

    public int getIdTypeOfProduct() {
        return idTypeOfProduct;
    }

    public void setIdTypeOfProduct(int idTypeOfProduct) {
        this.idTypeOfProduct = idTypeOfProduct;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }
}
