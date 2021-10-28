/*
# Ngày Tạo: 27 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab7;

public class Animal {
    private String breed;
    private float weight;
    private String food;
    private String location;
    private int age;
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
    Animal(){
        System.out.println("Tạo animal....");
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
}
