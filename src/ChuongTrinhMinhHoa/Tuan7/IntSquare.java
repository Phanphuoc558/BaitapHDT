/*
# Ngày Tạo: 21 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan7;

public class IntSquare {
    private int squareValue;
    private int calculateSquare(int squareValue){
        return (int)Math.pow(squareValue,2);
    }
    public int getSquare(){
        return calculateSquare(squareValue);
    }
    IntSquare(int x){
        squareValue = x;
    }
}
