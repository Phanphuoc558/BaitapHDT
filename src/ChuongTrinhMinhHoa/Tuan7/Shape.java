/*
# Ngày Tạo: 21 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan7;

public class Shape {
    private String music;
    private boolean click = false;
    public void click(){
        click = !click;
	}
    public void playSound(){
        if(click ==true){
            System.out.println("Phát ra file âm thanh "+music);
        }	
    }
    public void rotate(){
        if(click==true){
            System.out.println("Xoay 360 độ quanh theo chiều kim đồng hồ");
        }
    }
}
