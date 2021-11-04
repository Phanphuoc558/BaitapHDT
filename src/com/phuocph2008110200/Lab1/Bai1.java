package com.phuocph2008110200.lab1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào họ và tên: ");
        String hoten = in.nextLine();
        System.out.print("Nhập vào điểm: ");
        float diem = in.nextFloat();
        System.out.print(hoten+" "+diem+" điểm.");
        in.close();
    }
}
