/*
# Ngày Tạo: 20 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab6;

public class TestDrive {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Amoeba amoeba = new Amoeba(3,5);
        square.click();
        square.rotate();
        square.playSound();
        circle.click();
        circle.rotate();
        circle.playSound();
        triangle.click();
        triangle.rotate();
        triangle.playSound();
        amoeba.click();
        amoeba.rotate();
        amoeba.playSound();
    }
}
