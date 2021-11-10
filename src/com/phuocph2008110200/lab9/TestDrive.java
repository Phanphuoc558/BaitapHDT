package com.phuocph2008110200.lab9;

import com.phuocph2008110200.lab7.Cat;
import com.phuocph2008110200.lab7.Dog;
import com.phuocph2008110200.lab7.Lion;
import com.phuocph2008110200.lab7.Wolf;

public class TestDrive {
    public static void main(String[] args) {
        QuanLyDongVat list = new QuanLyDongVat();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();
        Lion lion = new Lion();
        dog.setName("milu");
        dog.setAge(3);
        cat.setName("hoang thuong");
        cat.setAge(2);
        wolf.setName("Co Lang");
        wolf.setAge(5);
        lion.setName("King Star");
        lion.setAge(10);
        list.add(dog);
        list.add(cat);
        list.add(wolf);
        list.add(lion);
        list.introduce();
        list.roam();
        list.makeNoise();
        if(list.searchName("Hoang thuong")!=null){
            System.out.println("Find out!");
        }else 
            System.out.println("Not found!");
    }
}
