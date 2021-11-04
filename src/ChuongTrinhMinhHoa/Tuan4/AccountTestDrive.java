/*
# Ngày Tạo: 30 Sept 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan4;

import java.util.Scanner;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số tiền gửi: ");
        int a = in.nextInt();
        account.deposit(a);
        account.showData();
        System.out.print("Nhập vào số tiền rút: ");
        int b = in.nextInt();
        account.withdraw(b);
        account.showData();
        in.close();
    }
}
