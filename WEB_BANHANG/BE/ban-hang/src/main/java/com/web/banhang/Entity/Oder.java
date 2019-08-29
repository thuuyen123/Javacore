package com.web.banhang.Entity;

import java.util.Date;

public class Oder {
    private int idOder;
    private int idUser;
    private String status;
    private String address;
    private Date dateOfOder;
    private Date dateOfDelivery;
    private String describe;
    private int total;

    public Oder() {
    }

    public Oder(int idOder, int idUser, String status, String address, Date dateOfOder,
                Date dateOfDelivery, String describe, int total) {
        this.idOder = idOder;
        this.idUser = idUser;
        this.status = status;
        this.address = address;
        this.dateOfOder = dateOfOder;
        this.dateOfDelivery = dateOfDelivery;
        this.describe = describe;
        this.total = total;
    }

    public int getIdOder() {
        return idOder;
    }

    public void setIdOder(int idOder) {
        this.idOder = idOder;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfOder() {
        return dateOfOder;
    }

    public void setDateOfOder(Date dateOfOder) {
        this.dateOfOder = dateOfOder;
    }

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
