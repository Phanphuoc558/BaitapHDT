package com.phuocph2008110200.kiemtragiuaky;

import java.util.Scanner;

public class Nguoi {
    Scanner in = new Scanner(System.in);
    private String hoTen;
    private String diaChi;
    public String toString() {
        return hoTen+" "+diaChi;
    }
    Nguoi(String hoTen,String diaChi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
}
