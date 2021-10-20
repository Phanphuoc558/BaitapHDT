/*
# Ngày Tạo: 14 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan6;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh maytinh = new MayTinh();
        int t1 = maytinh.tong(5, 6);
        int t2 = maytinh.tong(5, 6, 7);
        System.out.println("T1: "+t1);
        System.out.println("T2: "+t2);
    }
}
