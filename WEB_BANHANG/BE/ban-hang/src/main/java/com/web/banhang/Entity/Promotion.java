package com.web.banhang.Entity;

public class Promotion {
    private int idPromotion;
    private String promotion;

    public Promotion() {
    }

    public Promotion(int idPromotion, String promotion) {
        this.idPromotion = idPromotion;
        this.promotion = promotion;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }
}
