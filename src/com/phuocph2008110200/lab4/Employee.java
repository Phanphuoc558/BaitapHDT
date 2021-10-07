/*
# Ngày Tạo: 07 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab4;

import java.util.Scanner;

public class Employee {
    String name;
    String salary;
    Scanner in = new Scanner(System.in);
    void getName(){
        System.out.print("Nhập tên nhân viên: ");
        name = in.nextLine();

    }
    void getSalary(){
        salary = in.nextLine();
        System.out.print("Nhập lương: ");
    }
    void show(){
        System.out.println("Tên nhân viên: "+name);
        System.out.println("Lương: "+salary);
    }
}
