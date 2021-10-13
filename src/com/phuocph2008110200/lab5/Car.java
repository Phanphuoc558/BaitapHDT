/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

public class Car {
    String tenChuXe,hangSanXuat,dong,giayPhep;
    int dungTich;
    void getName(String name){
        tenChuXe = name;
    }
    void getHang(String x){
        hangSanXuat = x;
    }
    void getGiayPhep(String x){
        giayPhep = x;
    }
    void getDungTich(int x){
        dungTich = x;
    }
    void showData(){
        System.out.println("Tên chủ sở hữu: "+tenChuXe);
        System.out.println("Giấy phép lái xe loại: "+giayPhep);
        System.out.println("Dòng: "+dong);
        System.out.println("Dung tích xăng: "+dungTich+" lít");
        System.out.println("Hãng sản xuất: "+hangSanXuat);
    }
    Car(String x){
        dong = x;
    }
}
