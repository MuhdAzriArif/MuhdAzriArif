import java.util.spi.CalendarNameProvider;

public class LoanOfficer extends Employee {
    public LoanOfficer(String Name, Calendar DOB, Address Address, int IcNo, String phone, String gender, String Email, String username, String password, String Role,String EmployeeID, String Position ){
        super(Name, DOB, Address, IcNo, phone, gender, Email, username, password, Role, EmployeeID, Position);
    }

    public void approveLoan(){
        //loan.setStatus("Approved");
        //System.out.println("Loan approved by officer: " + getName());
    }

    public void rejectLoan(){
        //loan.setStatus("Rejected");
        //System.out.println("Loan rejected by officer: " + getName());
    }
  
}
