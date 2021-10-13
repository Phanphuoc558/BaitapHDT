/*
# Ngày Tạo: 13 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.lab5;

public class Account {
    int number_account;
    int number_balance;
    String name;
    void showData(){
        System.out.println("Account Number: "+number_account);
        System.out.println("Account Balance: "+number_balance);
    }
    void deposit(int amount){
        number_balance += amount;
    }
    void withdraw(int amount){
        number_balance -= amount;
    }
    Account(String x,int number){
        name = x;
        number_account = number;
    }
}
