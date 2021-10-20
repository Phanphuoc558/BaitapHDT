/*
# Ngày Tạo: 14 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan6;

public class Dog {
    String breed,color,name;
    int age;
    void bark(){
        System.out.println("GÂU GÂU GÂU !!!");
    }
    Dog(String ten,int year){
        name = ten;
        age = year;
    }
    Dog(){}
    void bark (int numberOfBark){
        while(numberOfBark>0){
            System.out.println("GÂU GÂU GÂU !!!");
            numberOfBark--;
        }
    }
}
