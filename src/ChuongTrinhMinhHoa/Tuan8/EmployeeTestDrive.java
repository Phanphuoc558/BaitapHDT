/*
# Ngày Tạo: 28 Oct 2021
# Tác Giả: Phan Hửu Phước
*/
package ChuongTrinhMinhHoa.Tuan8;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Phan Hửu Phước");
        employee.setSalary(30);
        employee.setBirthday("01/03/2002");
        System.out.println(employee);
        System.out.println(employee.getName());
    }
}
