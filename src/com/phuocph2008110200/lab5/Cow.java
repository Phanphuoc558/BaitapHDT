/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

public class Cow {
    int age,weight;
    Cow(int year,int amount){
        age = year;
        weight = amount;
    }
    void showData(){
        System.out.println("Số tuổi: "+age);
        System.out.println("Cân nặng: "+weight+" Kg");
    }
    Cow(){

    }
}
