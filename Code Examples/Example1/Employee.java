public class Employee {
    private String eName;
    private int basicSalary;
    private static int employeeCount = 0;

    public Employee() {
        this.eName = "";
        this.basicSalary = 0;
        employeeCount++;
    }

    public Employee(String name, int bs) {
        this.eName = name;
        this.basicSalary = bs;
        employeeCount++;
    }

    public Employee(Employee e) {
        this.eName = e.eName;
        this.basicSalary = e.basicSalary;
        employeeCount++;
    }

    public String getName() {
        return eName;
    }

    public int getSalary() {
        return basicSalary;
    }

    public void setName(String eName) {
        this.eName = eName;
    }

    public void setSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Income: " + getNetIncome());
    }

    public int getNetIncome() {
        return basicSalary;
    }

    public static int countEmployees() {
        return employeeCount;
    }
}
