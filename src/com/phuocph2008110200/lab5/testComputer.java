/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

public class testComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.getNhaSanXuat("HP");
        computer.getNamSanXuat(2021);
        computer.getHeDieuHanh("Win 10");
        computer.getRam(4);
        computer.getCPU("core i3 11154G8");
        computer.getGia(14000000);
        computer.getNamBaoHanh(1);
        computer.showData();
    }
}
