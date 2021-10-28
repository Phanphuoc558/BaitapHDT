/*
# Ngày Tạo: 28 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan8;

import java.util.ArrayList;
import java.util.List;

import ChuongTrinhMinhHoa.Tuan7.Circle;
import ChuongTrinhMinhHoa.Tuan7.Shape;
import ChuongTrinhMinhHoa.Tuan7.Square;
import ChuongTrinhMinhHoa.Tuan7.Triangle;

public class ArrayListTestDrive extends ArrayList{
    public static void main(String[] args) {
        Circle circle = new Circle("Circle.AIF");
        Square square = new Square("Square.AIF");
        Triangle triangle = new Triangle("Triangle.AIF");
        List<Shape> list = new ArrayList<>();
        list.add(circle);
        list.add(square);
        list.add(triangle);
        for (Shape shape : list) {
            shape.click();
            shape.rotate();
            shape.playSound();
        }
    }
}
