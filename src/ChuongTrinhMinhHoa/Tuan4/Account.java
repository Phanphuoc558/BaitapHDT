/*
# Ngày Tạo: 30 Sept 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan4;

public class Account {
    int number_account;
    int number_balance;
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
}
