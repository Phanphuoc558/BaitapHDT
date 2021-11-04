package com.phuocph2008110200.kiemtragiuaky;

public class NhanVien extends Nguoi{
    private float heSoLuong;
    protected float tinhLuong(){
        return heSoLuong*1500000;
    }
    @Override
    public String toString() {
        return super.toString()+" "+tinhLuong()+ " VND";
    }
    public void setHeSoLuong() {
        do{
            System.out.println("Nhap vao he so luong cua nhan vien: ");
            heSoLuong=in.nextFloat();
        }while(heSoLuong<0);
    }
    NhanVien(String hoTen,String diaChi){
        super(hoTen,diaChi);
        setHeSoLuong();
    }
}
