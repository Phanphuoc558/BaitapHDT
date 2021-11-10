package com.phuocph2008110200.lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào độ dài cạnh khối lập phương: ");
        int a = in.nextInt();
        System.out.println("Thể tích khối lập phương là: "+Math.pow(a,3));
        in.close();
    }
}
