/*
# Ngày Tạo: 20 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab6;

public class Circle {
    String music= "Đây là hình tròn à à á a a!!!";
    boolean click = false;
    void click(){
        click = !click;
	}
    void play(){
        if(click ==true){
            System.out.println("Xoay 360"); 
            System.out.println(music);
        }
        else
            System.out.println(" Đã ngừng !!!");	
    }
}
