/*
# Ngày Tạo: 06 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab4;

import java.util.Scanner;

public class NganHang {
        public static void main(String[] args) {
                Account account = new Account();
                Employee employee = new Employee();
                Scanner in = new Scanner(System.in);
                int chose;
                do{
                        System.out.println("***************MENU BANK*****************");
                        System.out.println("| 1. Rút, gửi, xem thông tin tài khoản. |");
                        System.out.println("| 2. Nhân viên.                         |");
                        System.out.println("| 3. Khách hàng.                        |");
                        System.out.println("| Nhập số bất kì để kết thúc.           |");
                        System.out.println("*****************************************");
                        System.out.print("Nhập chức năng cần thực hiện: ");
                        chose = in.nextInt();
                        switch(chose){
                                case 1:{
                                        int chose1;
                                        do{
                                                System.out.println("****************MENU ACCOUNT*************");
                                                System.out.println("| 1. Rút tiền.                          |");
                                                System.out.println("| 2. Gửi tiền.                          |");
                                                System.out.println("| 3. Xem thông tin tài khoản.           |");
                                                System.out.println("| Nhập số bất kì để kết thúc.           |");
                                                System.out.println("*****************************************");
                                                System.out.print("Nhập chức năng cần thực hiện: ");
                                                chose1 = in.nextInt();
                                                switch(chose1){
                                                        case 1:{
                                                                System.out.print("Nhập vào số tiền rút: ");
                                                                int b = in.nextInt();
                                                                account.withdraw(b);
                                                        };break;
                                                        case 2:{
                                                                System.out.print("Nhập vào số tiền gửi: ");
                                                                int a = in.nextInt();
                                                                account.deposit(a);
                                                        };break;
                                                        case 3:{
                                                                account.showData();
                                                                System.out.print("Nhập số bất kì để quay về menu sau khi kiểm tra kỹ thông tin.");
                                                                int i = in.nextInt();
                                                        }
                                                }  
                                        }while(chose1 > 0 && chose1 < 4);
                                };break;
                                case 2:{
                                        int chose2;
                                        do{
                                                System.out.println("***************MENU EMPLOYEE*************");
                                                System.out.println("| 1. Nhập tên nhân viên.                          |");
                                                System.out.println("| 2. Nhập lương.                        |");
                                                System.out.println("| 3. Xem thông tin nhân viên.           |");
                                                System.out.println("| Nhập số bất kì để kết thúc.           |");
                                                System.out.println("*****************************************");
                                                System.out.print("Nhập chức năng cần thực hiện: ");
                                                chose2 = in.nextInt();
                                                switch(chose2){
                                                        case 1:employee.getName();break;
                                                        case 2:employee.getSalary();break;
                                                        case 3:{
                                                                employee.show();
                                                                System.out.print("Nhập số bất kì để quay về menu sau khi kiểm tra kỹ thông tin.");
                                                                int i = in.nextInt();
                                                        }                                                        
                                                }                                                
                                        }while(chose2>0 && chose2 <4);
                                }
                        }
                        
                }while(chose > 0 && chose < 4);
}
}