package com.phuocph2008110200.lab8.btLab7.Bai1;

public class TestDrive {
    public static void main(String[] args) {
        ChuNhat cn = new ChuNhat(5, 10);
        ChuNhat cn1 = new ChuNhat(8, 9.5);
        Vuong v = new Vuong(6);
        cn.print();
        v.print();
        cn1.print();
    }
}
