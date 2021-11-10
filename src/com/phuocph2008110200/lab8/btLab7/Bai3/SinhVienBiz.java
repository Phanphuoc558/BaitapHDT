package com.phuocph2008110200.lab8.btLab7.Bai3;

import com.phuocph2008110200.lab8.btLab7.Bai2.SinhVien;

public class SinhVienBiz extends SinhVien{
    private double marketing;
    private double sales;
    @Override
    protected double getDiem() {
        return (2*marketing + sales)/3;
    }
    protected SinhVienBiz(String name,double marketing, double sales){
        super(name,"Kinh Te");
        this.marketing = marketing;
        this.sales = sales;
    }
    public void show(){
        super.print();
    }
}
