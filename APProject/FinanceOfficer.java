public class FinanceOfficer extends Employee{
    
    private Dividend dividen;

    public FinanceOfficer(String name, Calendar DOB, Address addr, long ICNo, String phone, String gender, String Email, String username, String password, String role, String EmployeeID, String Position, Dividend dividen){
        super(name, DOB, addr, ICNo, phone, gender, Email, username, password, role, EmployeeID, Position);
        this.dividen = dividen;
    }

    public void printFinOffInfo(){
        System.out.println("Employee ID: " + super.getEmployeeID());
        System.out.println("Position: " + super.getPosition());
    }

    public void generateReport(BankAccount BankAcc, Dividend div){
        System.out.println("====FINANCE REPORT====");
        BankAcc.displayAccountDetails();
        BankAcc.displayReport();
        div.displayDiv();
    }
}
