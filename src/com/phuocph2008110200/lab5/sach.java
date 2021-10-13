/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

import java.util.Scanner;

public class sach {
    Scanner in = new Scanner(System.in);
    int  gianhap,giaxuat,soluong,namxuatban;
    String nhaxuatban,loai;
    void getGiaNhap(int x){
        gianhap = x;
    }
    void getGiaXuat(int x){
        giaxuat = x;
    }
    void getSoLuong(int x){
        soluong = x;
    }
    void getLoai(String type){
        loai = type;
    }
    void getNhaXuatBan(String x){
        nhaxuatban = x;
    }
    void getNamXuatBan(int year){
        namxuatban = year;
    }
    void showSach(){
        System.out.println("Nhà xuất bản: "+nhaxuatban);
        System.out.println("Năm xuất bản: "+namxuatban);
        System.out.println("Loại: "+loai);
        System.out.println("Giá nhập: "+gianhap);
        System.out.println("Giá xuất: "+giaxuat);
        System.out.println("Số lượng: "+soluong);
    }
    sach(int amount){
        soluong = amount;
    }
}