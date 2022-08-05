package com.example.vegetableui;

public class VegetableModel {
    public int img;
    public String name,Kg,Rs;

    public VegetableModel(int img, String name, String kg, String rs) {
        this.img = img;
        this.name = name;
        Kg = kg;
        Rs = rs;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKg() {
        return Kg;
    }

    public void setKg(String kg) {
        Kg = kg;
    }

    public String getRs() {
        return Rs;
    }

    public void setRs(String rs) {
        Rs = rs;
    }
}
