package Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee []employee = new Employee[10];
        employee[0] = new Employee();
        employee[0].setDetails(1769095,"Ajaz","Shaik",791000.00,"shaikajaz98@gmail.com");
        employee[0].display();
        employee[1] = new Employee();
        employee[1].setEmpId(1765432);
        employee[1].setFirstName("Suyash");
        employee[1].setLastName("Yadav");
        employee[1].setSalary(1500000.00);
        employee[1].setEmailId("suyashyadav@gmail.com");
        System.out.println("EmployeeId: "+employee[1].getEmpId()+"\nSalary: "+employee[1].getSalary());

    }


}
