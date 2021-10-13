/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

public class testAccount {
    public static void main(String[] args) {
        Account account = new Account("Phan Hửu Phước", 123456789);
        account.showData();
        account.deposit(100000);
        account.showData();
        account.withdraw(50000);
        account.showData();
    }
}
