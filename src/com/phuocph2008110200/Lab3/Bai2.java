/*
# Ngày Tạo: 23 Sept 2021
# Tác Giả: Phan Hửu Phước
*/
package com.phuocph2008110200.Lab3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i=2;i<=10;i++){
            for(int j = 1;j<=10;j++){
                System.out.printf("%d x %d = %d",i,j,i*j);
                System.out.println();
            }
            System.out.println();
        }
    }
}
