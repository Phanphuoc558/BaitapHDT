/*
# Ngày Tạo: 14 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan6;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        String name = "Lucky";
        dog.age = 1;
        dog.name =name;
        System.out.println("Tên: "+dog.name);
        System.out.println("Tuổi: "+dog.age);
        dog.bark();
        Dog dog1 = new Dog("Milu", 2);
        System.out.println("Tên: "+dog1.name);
        System.out.println("Tuổi: "+dog1.age);
        dog1.bark();
        dog1.bark(5);
    }
}