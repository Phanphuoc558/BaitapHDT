package com.phuocph2008110200.lab9;

import java.util.ArrayList;

import com.phuocph2008110200.lab7.Animal;
import com.phuocph2008110200.lab7.Cat;
import com.phuocph2008110200.lab7.Dog;

public class QuanLyDongVat {
    ArrayList<Animal> list = new ArrayList<Animal>();
    public void add(Animal animal){
        animal = new Animal();
        list.add(animal);
    }
    public void makeNoise(){
        for (Animal animal : list) {
            animal.makeNoise();
        }
    }
    public void roam(){
        for (Animal animal : list) {
            animal.roam();
        }
    }
    public void introduce(){
        for (Animal animal : list) {
            animal.introduce();
        }
    }
    public Animal searchNameCat(String name){
        Cat c = null;
        for(Animal animal: list){
            if(animal instanceof Cat){
                Cat cat =(Cat)animal;
                if(cat.getName().equalsIgnoreCase(name)){
                    c = cat;
                }
            }
        }
        return c;
    }
    public Animal searchNameDog(String name){
        Dog d = null;
        for (Animal animal : list) {
            if(animal instanceof Dog){
                Dog dog =(Dog)animal;
                if(dog.getName().equalsIgnoreCase(name)){
                    d = dog;
                }
            }
        }
        return d;
    }
}
