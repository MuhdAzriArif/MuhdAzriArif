
public class Employee extends Person{
    private String EmployeeID;
    private String Position;

    public Employee(String name, Calendar DOB, Address addr, long ICNo, String phone, String gender, String Email, String username, String password, String role, String EmployeeID, String Position){
        super(name, DOB, addr, ICNo, phone, gender, Email, username, password, role);
        this.EmployeeID = EmployeeID;
        this.Position = Position;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public String getPosition() {
        return Position;
    }
}
