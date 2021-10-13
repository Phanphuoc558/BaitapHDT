/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

import java.util.Scanner;

public class testEmployee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee employee = new Employee("Phan Hửu Phước");
        System.out.print("Nhập vào địa chỉ nhân viên: ");
        String text = in.nextLine();
        employee.getAddress(text);
        employee.getNgaySinh("01/03/2002");
        employee.getBoPhan("IT");
        employee.getSalary(2000);
        employee.showData();
    }
}
