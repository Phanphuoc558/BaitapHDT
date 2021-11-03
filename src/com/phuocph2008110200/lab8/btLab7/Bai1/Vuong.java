package com.phuocph2008110200.lab8.btLab7.Bai1;

public class Vuong extends ChuNhat{
    protected Vuong(double canh){
        super(canh, canh);
    }
    @Override
    protected void print() {
        System.out.println("Hinh vuong co canh la: "+dai);
        System.out.println("Chu vi hinh vuong la: "+getChuVi());
        System.out.println("Dien tich hinh vuong la: "+getDienTich());
    }
}
