package com.phuocph2008110200.lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        int a = in.nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = in.nextInt();
        if(a==0)
            if(b==0)
                System.out.println("PT có vô số nghiệm.");
            else
                System.out.println("PT vô nghiệm.");
        else
            System.out.println("PT có nghiệm duy nhất: x = "+(-b/a));
        in.close();
    }
}
