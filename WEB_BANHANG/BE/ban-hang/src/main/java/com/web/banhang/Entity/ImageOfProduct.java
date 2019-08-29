package com.web.banhang.Entity;

public class ImageOfProduct {
    private int idImageProduct;
    private int idProduct;
    private String urlImageProduct;

    public ImageOfProduct() {

    }

    public ImageOfProduct(int idImageProduct, int idProduct, String urlImageProduct) {
        this.idImageProduct = idImageProduct;
        this.idProduct = idProduct;
        this.urlImageProduct = urlImageProduct;
    }

    public int getIdImageProduct() {
        return idImageProduct;
    }

    public void setIdImageProduct(int idImageProduct) {
        this.idImageProduct = idImageProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getUrlImageProduct() {
        return urlImageProduct;
    }

    public void setUrlImageProduct(String urlImageProduct) {
        this.urlImageProduct = urlImageProduct;
    }
}
