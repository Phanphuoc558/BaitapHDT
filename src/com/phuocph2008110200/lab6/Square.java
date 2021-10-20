/*
# Ngày Tạo: 20 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab6;

public class Square {
    String music= "Square sound";
    boolean click = false;
    void click(){
        click = !click;
	}
    void play(){
        if(click ==true){
            System.out.println("Xoay 360"); 
            System.out.println("Đây là hình vuông nà nà ná na na!!!");
        }
        else
            System.out.println(" Đã ngừng !!!");	
    }
}
