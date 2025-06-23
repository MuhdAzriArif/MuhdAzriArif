import java.util.ArrayList;
import java.util.Scanner;

public class AccountHolder extends Person {
    BankAccount account;

    public AccountHolder(String name, Calendar dOB, Address addr, long iCNo, String phone, String gender, String email,
            String username, String password, String role, BankAccount account) {
        super(name, dOB, addr, iCNo, phone, gender, email, username, password, role);
        this.account = account;
    }

    public void accountSetter(BankAccount acc) {
        this.account = acc;
    }

    public BankAccount accountGetter() {
        return account;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void updateInformation(Address address, String phone, String email) {
        super.update(address, phone, email);
    }

    public BankAccount getAccount() {
        return account;
    }


}
