/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

public class Employee {
    String name,address,bophan,ngaysinh;
    int salary;
    void getAddress(String text){
        address = text;
    }
    void getBoPhan(String text){
        bophan = text;
    }
    void getNgaySinh(String text){
        ngaysinh = text;
    }
    void getSalary(int amount){
        salary = amount;
    }
    void showData(){
        System.out.println("Tên: "+name);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Ngày sinh: "+ngaysinh);
        System.out.println("Bộ Phận: "+bophan);
        System.out.println("Lương: "+salary+"$");
    }
    Employee(String text){
        name = text;
    }
}
