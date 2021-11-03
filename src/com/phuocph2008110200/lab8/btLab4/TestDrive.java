package com.phuocph2008110200.lab8.btLab4;

import java.util.ArrayList;

import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        SanPham sp3 = new SanPham("Laptop", 622);
        SanPham sp4 = new SanPham("Desktop", 700, 70);
        sp1.nhap();
        sp2.nhap();
        sp1.xuat();
        sp2.xuat();
        sp3.xuat();
        sp4.xuat();
        int n;
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        System.out.print("Nhap vao so luong phan tu: ");
        n = in.nextInt();
        for(int i=0;i<n;i++){
            SanPham sp = new SanPham();
            list.add(sp);
        }
        for(SanPham sPham: list){
            sPham.nhap();
        }
        for(SanPham sPham: list){
            sPham.xuat();
        }
     }
}
