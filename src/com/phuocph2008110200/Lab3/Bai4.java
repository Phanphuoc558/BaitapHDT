/*
# Ngày Tạo: 10 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] a;
        float[] b;
        System.out.print("Nhập vào số lượng sinh viên cần ghi vào danh sách: ");
        int n = in.nextInt();
        a = new String[n];
        b = new float[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("\nNhập vào tên sinh viên: ");
            a[i] = in.nextLine();
            System.out.print("Nhập vào điểm của "+a[i]);
            b[i] = in.nextFloat();
        }
    }
}
