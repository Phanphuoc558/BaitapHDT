package com.phuocph2008110200.lab8.btLab7.Bai1;

public class ChuNhat {
    protected double rong;
    protected double dai;
    protected double getDienTich(){
        return dai*rong;
    }
    protected double getChuVi(){
        return (dai+rong)*2;
    }
    protected void print(){
        System.out.println("Hinh chu nhat co chieu dai: "+dai+" va chieu rong: "+rong);
        System.out.println("Chu vi cua hinh chu nhat nay la: "+getChuVi());
        System.out.println("Dien tich cua hinh chu nhat nay la: "+getDienTich());
    }
    protected ChuNhat(double dai,double rong){
        this.dai=dai;
        this.rong=rong;
    }
}
