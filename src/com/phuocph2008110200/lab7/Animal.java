/*
# Ngày Tạo: 27 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab7;

public class Animal {
    protected String breed;
    protected float weight;
    protected String food;
    protected String location;
    protected int age;
    protected void makeNoise(){
        System.out.println("A A A A!!!");
    }
    protected void eat(){
        System.out.println("Đang ăn!!!");
    }
    protected void sleep(){
        System.out.println("Đang ngủ đừng làm phiền ");
    }
    protected void roam(){
        System.out.println("Chuẩn bị gank bot lấy double kill!!!");
    }
}
