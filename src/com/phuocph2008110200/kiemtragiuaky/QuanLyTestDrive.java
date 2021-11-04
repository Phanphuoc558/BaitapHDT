package com.phuocph2008110200.kiemtragiuaky;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy list = new DanhSachQuanLy();
        HocVien hocVien = new HocVien("Phan Huu Phuoc","85/5");
        NhanVien nhanVien = new NhanVien("Tran Le Quang Vinh","100/8");
        KhachHang khachHang = new KhachHang("Nguyen Tuan Phat", "100/9", "VN group", 3000000);
        list.themNguoi(hocVien);
        list.themNguoi(nhanVien);
        list.themNguoi(khachHang);
        list.inList();
    }
}
