/*
# Ngày Tạo: 27 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab7;

public class Amoeba extends Shape{
    @Override
    protected void playSound() {
        // code dùng để chạy file HIF
        if(click == true){
            System.out.println("Phát ra âm thanh file Amoeba.HIF");
        }
    }
}
