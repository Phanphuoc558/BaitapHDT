package com.phuocph2008110200.lab8.btLab7.Bai3;

import com.phuocph2008110200.lab8.btLab7.Bai2.SinhVien;

public class SinhVienIT extends SinhVien{
    private double diemJava;
    private double diemHtml;
    private double diemCss;
    protected SinhVienIT(String name,double diemJava,double diemCss,double diemHtml){
        super(name,"IT");
        this.diemCss=diemCss;
        this.diemHtml=diemHtml;
        this.diemJava=diemJava;
    }
    @Override
    protected double getDiem() {
        return (2*diemJava+diemCss+diemHtml)/4;
    }
    public void show(){
        super.print();
    }
}
