/*
# Ngày Tạo: 25 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab7;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle.AIF");
        Square square = new Square("Square.AIF");
        Triangle triangle = new Triangle("Triangle.AIF");
        Amoeba amoeba = new Amoeba();
        circle.click();
        circle.rotate();
        circle.playSound();
        square.click();
        square.rotate();
        square.playSound();
        triangle.click();
        triangle.rotate();
        triangle.playSound();
        amoeba.click();
        amoeba.rotate();
        amoeba.playSound();
    }
}
