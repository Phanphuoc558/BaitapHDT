/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

public class testCar {
    public static void main(String[] args) {
        Car car = new Car("Wave alpha");
        car.getName("Phan Hửu Phước");
        car.getGiayPhep("A1");
        car.getHang("Honda");
        car.getDungTich(4);
        car.showData();
    }
}
