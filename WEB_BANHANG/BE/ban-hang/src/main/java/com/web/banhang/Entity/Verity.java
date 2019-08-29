package com.web.banhang.Entity;

public class Verity {
    private int idUser;
    private int idTypeOfUser;

    public Verity() {
    }

    public Verity(int idUser, int idTypeOfUser) {
        this.idUser = idUser;
        this.idTypeOfUser = idTypeOfUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdTypeOfUser() {
        return idTypeOfUser;
    }

    public void setIdTypeOfUser(int idTypeOfUser) {
        this.idTypeOfUser = idTypeOfUser;
    }
}
