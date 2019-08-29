package com.web.banhang.Entity;

import java.util.Date;

public class DetailsOfPromotion {
    private int idPromotion;
    private int idProduct;
    private Date startDate;
    private Date endDate;
    private int preCent;
    private int IdPromotion;

    public DetailsOfPromotion() {
    }

    public DetailsOfPromotion(int idPromotion, int idProduct
            , Date startDate, Date endDate, int preCent, int idPromotion1) {
        this.idPromotion = idPromotion;
        this.idProduct = idProduct;
        this.startDate = startDate;
        this.endDate = endDate;
        this.preCent = preCent;
        IdPromotion = idPromotion1;
    }

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPreCent() {
        return preCent;
    }

    public void setPreCent(int preCent) {
        this.preCent = preCent;
    }
}
