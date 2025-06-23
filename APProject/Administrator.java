
public class Administrator extends Employee{

    public Administrator(String name, Calendar DOB, Address addr, long ICNo, String phone, String gender, String Email, String username, String password, String role, String EmployeeID, String Position, Dividend dividen){
        super(name, DOB, addr, ICNo, phone, gender, Email, username, password, role, EmployeeID, Position);
    }

    public void resetPass(String password){
        super.reset(password);
    }
    


}
