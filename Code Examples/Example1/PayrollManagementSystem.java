public class PayrollManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 50000);
        SalesManager salesMgr1 = new SalesManager("Alice", 60000, 100000);

        System.out.println("Employee Details:");
        emp1.printEmployeeDetails();

        System.out.println("\nSales Manager Details:");
        salesMgr1.printEmployeeDetails();

        System.out.println("\nTotal employees: " + Employee.countEmployees());
    }
}
