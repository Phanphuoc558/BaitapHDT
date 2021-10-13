/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

public class testSach {
    public static void main(String[] args) {
        sach sach1 = new sach(20);
        sach1.getNhaXuatBan("Kim Đồng");
        sach1.getNamXuatBan(2021);
        sach1.getLoai("Truyện tranh");
        sach1.getGiaNhap(50000);
        sach1.getGiaXuat(55000);
        sach1.showSach();
    }
}
