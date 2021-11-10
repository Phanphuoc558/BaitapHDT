package com.phuocph2008110200.kiemtragiuaky;



public class HocVien extends Nguoi{
    private float diemMonhoc1;
    private float diemMonhoc2;
    private static int soLuongHV;
    
    protected float diemTB(){
        return (diemMonhoc1+diemMonhoc2)/2;
    }
    @Override
    public String toString() {
        return super.toString()+" "+diemMonhoc1+" "+diemMonhoc2+" "+" Diem trung binh "+diemTB();
    }
    public void setDiemMonhoc1() {
        do{
            System.out.println("Nhap vao diem mon 1: ");
            diemMonhoc1=in.nextFloat();
        }while(diemMonhoc1 < 0 && diemMonhoc1 > 10);
    }
    public void setDiemMonhoc2() {
        
        do{
            System.out.println("Nhap vao diem mon 2: ");
            diemMonhoc2=in.nextFloat();
        }while(diemMonhoc2 < 0 && diemMonhoc2 > 10);
    }
    HocVien(String hoTen,String diaChi){
        super(hoTen, diaChi);
        soLuongHV++;
        setDiemMonhoc1();
        setDiemMonhoc2();
    }
}
