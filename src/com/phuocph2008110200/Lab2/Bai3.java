package com.phuocph2008110200.lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số điện: ");
        float x = in.nextFloat();
        if(x<50)
            System.out.println("Số tiền phải trả là: "+x*1000);
        else
            System.out.println("Số tiền phải trả là: "+(50*1000+(x-50)*1200));
    }
}
