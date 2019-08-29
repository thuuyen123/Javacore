package com.web.banhang.Entity;

import java.util.Date;

public class DetailsOfComment {
    private int idComment;
    private int idUser;
    private int idProduct;
    private String content;
    private Date dateOfComment;

    public DetailsOfComment() {
    }

    public DetailsOfComment(int idComment,
                            int idUser, int idProduct, String content, Date dateOfComment) {
        this.idComment = idComment;
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.content = content;
        this.dateOfComment = dateOfComment;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(Date dateOfComment) {
        this.dateOfComment = dateOfComment;
    }
}
