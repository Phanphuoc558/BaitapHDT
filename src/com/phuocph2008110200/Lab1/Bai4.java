package com.phuocph2008110200.lab1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        int a = in.nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = in.nextInt();
        System.out.print("Nhập vào hệ số c: ");
        int c = in.nextInt();
        double  delta = Math.pow(b,2)-4*a*c;
        System.out.print("Căn delta là: "+Math.sqrt(delta));
        in.close();
    }
}
