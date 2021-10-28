/*
# Ngày Tạo: 28 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan8;

public class Employee extends Person{
    private int salary;
    public String toString(){
        String s;
        s = name+ ", "+birthday;
        s += ", " + salary;
        return s;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}
