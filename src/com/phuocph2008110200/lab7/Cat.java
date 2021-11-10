/*
# Ngày Tạo: 27 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab7;

public class Cat extends Claws{
    String color;
    @Override
    public void makeNoise() {
        System.out.println("Mew Mew Mew");
    }
    protected void catchMouse(){
        System.out.println("Bắt được N con chuột");
    }
    public Cat(String giong,int tuoi,String mau){
        setBreed(giong);
        setAge(tuoi);
        color = mau;
    }
    public Cat(){
        
    }
}
