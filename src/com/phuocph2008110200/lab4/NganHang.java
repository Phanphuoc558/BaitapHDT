/*
# Ngày Tạo: 06 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab4;

import java.util.Scanner;

public class NganHang {
        public static void main(String[] args) {
                Account account = new Account();
                Scanner in = new Scanner(System.in);
                System.out.print("Nhập vào số tiền gửi: ");
                int x = in.nextInt();
                account.deposit(x);
                account.showData();
                System.out.print("Nhập vào số tiền rút: ");
                int y = in.nextInt();
                account.withdraw(y);
                account.showData();
        }
}