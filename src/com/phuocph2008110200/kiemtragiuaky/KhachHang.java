package com.phuocph2008110200.kiemtragiuaky;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;
    @Override
    public String toString() {
        return super.toString()+" "+tenCongTy+" "+triGiaHoaDon+" VND";
    }
    public void setTriGiaHoaDon(double triGiaHoaDon) {
        do{
            System.out.println("Nhap vao tri gia hoa don cua khach hang: ");
            triGiaHoaDon = in.nextDouble();
        }while(triGiaHoaDon<0);
    }
    KhachHang(String hoTen,String diaChi,String tenCongTy,double triGiaHoaDon){
        super(hoTen,diaChi);
        this.tenCongTy = tenCongTy;
        setTriGiaHoaDon(triGiaHoaDon);
    }
}
