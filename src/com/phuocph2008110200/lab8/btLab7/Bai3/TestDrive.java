package com.phuocph2008110200.lab8.btLab7.Bai3;

public class TestDrive{
    public static void main(String[] args) {
        SinhVienIT svIT = new SinhVienIT("Phan Huu Phuoc",7.5, 7, 8);
        SinhVienBiz svKT = new SinhVienBiz("Diken Phan",6,7);
        svIT.show();
        svKT.show();
    }
}

