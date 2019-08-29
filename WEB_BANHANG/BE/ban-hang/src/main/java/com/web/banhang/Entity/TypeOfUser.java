package com.web.banhang.Entity;

public class TypeOfUser {
    private int idTypeOfUser;
    private int typeOfUser;

    public TypeOfUser(int idTypeOfUser, int typeOfUser) {
        this.idTypeOfUser = idTypeOfUser;
        this.typeOfUser = typeOfUser;
    }

    public TypeOfUser() {
    }

    public int getIdTypeOfUser() {
        return idTypeOfUser;
    }

    public void setIdTypeOfUser(int idTypeOfUser) {
        this.idTypeOfUser = idTypeOfUser;
    }

    public int getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(int typeOfUser) {
        this.typeOfUser = typeOfUser;
    }
}
