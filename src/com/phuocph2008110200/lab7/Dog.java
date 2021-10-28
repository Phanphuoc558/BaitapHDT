/*
# Ngày Tạo: 27 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab7;

public class Dog extends Canine{
    private String color;
    Dog(String giong,int tuoi,String mauLong){
        setBreed(giong);
        setAge(tuoi);
        color = mauLong;
    }
    protected void chaseCat(){
        System.out.println("Gâu gâu m chạy nữa đi con miêu!!!");
    }
    protected void bark(){
        System.out.println("Gâu gâu!!!\nCút đi cái thằng người lạ, cắn m h !!!");
    }
}
