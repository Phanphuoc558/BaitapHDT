/*
# Ngày Tạo: 20 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab6;

public class Circle {
    String music= "Circle.AIF";
    boolean click = false;
    void click(){
        click = !click;
	}
    void playSound(){
        if(click ==true){
            System.out.println("Phát ra file âm thanh "+music);
        }	
    }
    void rotate(){
        if(click==true){
            System.out.println("Xoay 360 độ quanh theo chiều kim đồng hồ");
        }
    }
}
