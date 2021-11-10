/*
# Ngày Tạo: 27 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab7;

public class Animal {
    private String name;
    private String breed;
    private float weight;
    private String food;
    private String location;
    private int age;
    public void makeNoise(){
        System.out.println("A A A A!!!");
    }
    public void eat(){
        System.out.println("Đang ăn!!!");
    }
    public void sleep(){
        System.out.println("Đang ngủ đừng làm phiền ");
    }
    public void roam(){
        System.out.println("Chuẩn bị gank bot lấy double kill!!!");
    }
    public Animal(){
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void introduce(){
        makeNoise();
        System.out.println("I'm "+getName()+" "+getAge()+" year old!");
    }
}
