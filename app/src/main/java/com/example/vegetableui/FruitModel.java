package com.example.vegetableui;

public class FruitModel {
    public int img1;
    public String name1,Kg1,Rs1;

    public FruitModel(int img1, String name1, String kg1, String rs1) {
        this.img1 = img1;
        this.name1 = name1;
        Kg1 = kg1;
        Rs1 = rs1;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getKg1() {
        return Kg1;
    }

    public void setKg1(String kg1) {
        Kg1 = kg1;
    }

    public String getRs1() {
        return Rs1;
    }

    public void setRs1(String rs1) {
        Rs1 = rs1;
    }
}
