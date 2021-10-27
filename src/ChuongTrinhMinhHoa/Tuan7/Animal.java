/*
# Ngày Tạo: 21 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan7;

public class Animal {
    protected String picture;
    protected String food;
    protected String hunger;
    protected String location;
    protected void makeNoise(){
        System.out.println("A A A A!!!");
    }
    protected void eat(){
        System.out.println("Đang ăn!!!");
    }
    protected void sleep(){
        System.out.println("Đang ngủ đừng làm phiền ");
    }
    protected void roam(){
        System.out.println("Chuẩn bị gank bot lấy double kill!!!");
    }
}
