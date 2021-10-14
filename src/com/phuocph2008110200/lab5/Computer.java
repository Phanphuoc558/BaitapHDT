/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

public class Computer {
    String nhaSanXuat,heDieuHanh,cpu;
    int namSanXuat,ram,gia,namBaoHanh;
    void getNhaSanXuat(String x){
        nhaSanXuat = x;
    }
    void getHeDieuHanh(String x){
        heDieuHanh = x;
    }
    void getCPU(String x){
        cpu = x;
    }
    void getNamBaoHanh(int x){
        namBaoHanh = x;
    }
    void getNamSanXuat(int x){
        namSanXuat = x;
    }
    void getRam(int x){
        ram = x;
    }
    void getGia(int x){
        gia = x;
    }
    void showData(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat);
        System.out.println("Năm sản xuất: "+namSanXuat);
        System.out.println("Hệ điều hành: "+heDieuHanh);
        System.out.println("Ram: "+ram+" GB");
        System.out.println("CPU: "+cpu);
        System.out.println("Giá: "+gia+" VND");
        System.out.println("Năm bảo hành: "+namBaoHanh+" năm");
    }
    Computer(String company,String winx,String CPU,int year,int RAM,int price,int insurance){
        nhaSanXuat =company;
        heDieuHanh =winx;
        cpu=CPU;
        namSanXuat=year;
        ram = RAM;
        gia = price;
        namBaoHanh = insurance;
    }
}
