package com.phuocph2008110200.lab8.btLab4;

import java.util.Scanner;

public class SanPham {
    private Scanner in = new Scanner(System.in);
    private String tenSP;
    private double donGia;
    private double giamGia;
    private double getThueNhapKhau(){
        return donGia*0.1;
    }
    protected void xuat(){
        System.out.println("Ten san pham: "+tenSP);
        System.out.println("Don gia: "+donGia+" $");
        System.out.println("Giam gia: "+giamGia+" $");
        System.out.println("Thue nhap khau: "+getThueNhapKhau()+" $");
    }
    protected void nhap(){
        System.out.print("Nhap vao ten san pham: ");
        tenSP = in.nextLine();
        System.out.print("Nhap vao don gia: ");
        donGia = in.nextDouble();
        System.out.print("Giam gia: ");
        giamGia = in.nextDouble();
    }
    public SanPham(String tenSP,double donGia,double giamGia){
        this.tenSP = tenSP ;
        this.donGia = donGia;
        this. giamGia = giamGia;
    }
    public SanPham(String tenSP,double donGia){
        this(tenSP,donGia,0);
    }
    public SanPham(){

    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public String getTenSP() {
        return tenSP;
    }
}
