package Employee;

public class Employee {
    public Integer empId;
    public String firstName;
    public String lastName;
    public Double salary;
    public String emailId;

    public Employee(Integer empId, String firstName, String lastName, Double salary, String emailId) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.emailId = emailId;
    }

    public void setDetails(Integer empId, String firstName, String lastName, Double salary, String emailId)
    {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.emailId = emailId;
    }
    public void display()
    {
        System.out.println("Java8.Employee Id:"+empId);
        System.out.println("EmployeeFirstName:"+firstName);
        System.out.println("Java8.Employee LastName:"+lastName);
        System.out.println("Java8.Employee Salary:"+salary);
        System.out.println("Java8.Employee emailId:"+emailId);
    }

    public Employee() {}

    public Integer getEmpId()
    {
        return empId;
    }

    public void setEmpId(Integer empId)
    {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
