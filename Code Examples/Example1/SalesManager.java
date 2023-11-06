public class SalesManager extends Employee {
    private int salesAmount;

    public SalesManager() {
        super();
        this.salesAmount = 0;
    }

    public SalesManager(String name, int bs, int sa) {
        super(name, bs);
        this.salesAmount = sa;
    }

    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("Sales Amount: " + salesAmount);
    }

    @Override
    public int getNetIncome() {
        int commission = (int) (0.1 * salesAmount);
        return super.getSalary() + commission;
    }

    public static int countEmployees() {
        return Employee.countEmployees(); 
    }
}
