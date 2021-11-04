package com.phuocph2008110200.lab8.btLab7.Bai2;

public class SinhVien {
    protected String hoTen;
    protected String nganh;
    public void print(){
        System.out.println("Ho ten SV: "+hoTen);
        System.out.println("Nganh hoc: "+nganh);
        System.out.printf("Diem trung binh: %.2f \n",getDiem());
        System.out.println("Xep loai: "+getHocLuc());
    }
    protected SinhVien(String name,String nganh){
        hoTen = name;
        this.nganh=nganh;
    }
    protected double getDiem(){
        return 8;
    }
    protected String getHocLuc(){
        if(getDiem() >=5 && getDiem() < 6.5)
            return "Trung Binh";
        if(getDiem() >= 6.5 && getDiem() < 7.5)
            return "Kha";
        if(getDiem() >= 7.5 && getDiem() < 9)
            return "Gioi";
        if(getDiem() >= 9)
            return "Xuat sac";
        return "Yeu ";
    }
}