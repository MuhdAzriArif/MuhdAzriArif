

class Person {
    private String name;
    private Calendar DOB;
    private Address address;
    private long ICNo;
    private String phone;
    private String gender;
    private String email;
    private String username;
    private String password;
    private String role;

    public Person(String name, Calendar dOB, Address addr, long iCNo, String phone, String gender, String email, String username, String password, String role) {
        this.name = name;
        this.DOB = dOB;
        this.address = addr;
        this.ICNo = iCNo;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void update(Address address, String phone, String email){
        this.address = address;
        this.phone = phone; 
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Calendar getDOB() {
        return DOB;
    }

    public Address getAddr() {
        return address;
    }

    public long getICNo() {
        return ICNo;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean usernameChecker(String user){
        if (user.equals(this.username)){
            return true;
        } else {
            return false;
        }
    }

    public boolean passwordChecker(String pass){
        if (pass.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }

    public void reset(String password) {
        this.password = password;
    }
}
