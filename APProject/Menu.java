import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void mainMenu(ArrayList<AccountHolder> acc, ArrayList<BankOfficer> bnk, ArrayList<FinanceOfficer> fin,  ArrayList<LoanOfficer> loa, ArrayList<Administrator> adm,Dividend div){
        Scanner sc = new Scanner(System.in);
        boolean logic = true;
        int switchHolder = 0;
        System.out.println("===Welcome to MyBank===");
        while (logic) {
            System.out.println("===Main Menu===");
            System.out.println("1. Login\n2. Register New Account\n3. Exit"); 
            while (true) {
                System.out.print("");
                try {
                    switchHolder = sc.nextInt(); // Attempt to read an integer
                    break; // Exit loop if input is valid
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    sc.next(); // Clear the invalid input from the scanner
                }
            }
    
            switch (switchHolder) {
                case 1:
                    String username;
                    String password;
                    sc.nextLine();
                    System.out.println("Enter username: ");
                    username = sc.nextLine();
                    System.out.println("Enter password: ");
                    password = sc.nextLine();
                    if (username.length() < 3) {
                        System.out.println("Invalid username format.");
                        break;
                    }
                    String prefix = username.substring(0, 3).toUpperCase();

                    switch (prefix) {
                        case "FIN":
                            int f = 0;
                            boolean fB = false;
                            for (int i = 0; i < fin.size(); i++){
                                boolean userBool = fin.get(i).usernameChecker(username);
                                boolean passBool = fin.get(i).passwordChecker(password);
                                if (userBool && passBool){
                                    f = i;
                                    fB = true;
                                    break;
                                } else {
                                    fB = false;
                                }
                            }
                            if (fB) {
                                FinanceOfficer finHold = fin.get(f);
                                menuFinanceOfficer(finHold,div);
                            } else {
                                System.out.println("=======Warning==============Warning=======\n!!!!username or password are incorrect!!!!\n=======Warning==============Warning=======");
                            }
                            break;
                        case "LOA":
                            int l = 0;
                            boolean lB = false;
                            for (int i = 0; i < loa.size(); i++){
                                boolean userBool = loa.get(i).usernameChecker(username);
                                boolean passBool = loa.get(i).passwordChecker(password);
                                if (userBool && passBool){
                                    l = i;
                                    lB = true;
                                    break;
                                } else {
                                    lB = false;
                                }
                            }
                            if (lB) {
                                LoanOfficer loanHold = loa.get(l);
                                menuLoanOfficer(loanHold);
                            } else {
                                System.out.println("=======Warning==============Warning=======\n!!!!username or password are incorrect!!!!\n=======Warning==============Warning=======");
                            }
                            break;
                        case "ADM":
                            int a = 0;
                            boolean aB = false;
                            for (int i = 0; i < adm.size(); i++){
                                boolean userBool = adm.get(i).usernameChecker(username);
                                boolean passBool = adm.get(i).passwordChecker(password);
                                if (userBool && passBool){
                                    a = i;
                                    aB = true;
                                    break;
                                } else {
                                    aB = false;
                                }
                            }
                            if (aB) {
                                Administrator adminHold = adm.get(a);
                                menuAdministrator(adminHold,acc,bnk,fin,loa);
                            } else {
                                System.out.println("=======Warning==============Warning=======\n!!!!username or password are incorrect!!!!\n=======Warning==============Warning=======");
                            }
                            break;
                        case "BNK":
                            int b = 0;
                            boolean bB = false;
                            for (int i = 0; i < bnk.size(); i++){
                                boolean userBool = bnk.get(i).usernameChecker(username);
                                boolean passBool = bnk.get(i).passwordChecker(password);
                                if (userBool && passBool){
                                    b = i;
                                    bB = true;
                                    break;
                                } else {
                                    bB = false;
                                }
                            }
                            if (bB){
                                BankOfficer bnkHold = bnk.get(b);
                                menuBankOfficer(bnkHold,acc);
                            } else {
                                System.out.println("=======Warning==============Warning=======\n!!!!username or password are incorrect!!!!\n=======Warning==============Warning=======");
                            }
                            break;
                        default:
                            int c = 0;
                            boolean cB = false;
                            for (int i = 0; i < acc.size(); i++){
                                boolean userBool = acc.get(i).usernameChecker(username);
                                boolean passBool = acc.get(i).passwordChecker(password);
                                if (userBool && passBool){
                                    c = i;
                                    cB = true;
                                    break;
                                } else {
                                    cB = false;
                                }
                            }
                            if (cB) {
                                AccountHolder accHold = acc.get(c);
                                menuAccountHolder(accHold,acc);
                            } else {
                                System.out.println("=======Warning==============Warning=======\n!!!!username or password are incorrect!!!!\n=======Warning==============Warning=======");
                            }
                            break;
                    
                    }
                    break;
                case 2:
                    openCustAcc(acc);
                    break;
                case 3:
                    System.out.println("=====Thank You=====\n===See You Again===");
                    logic = false;
                    break;
                default:
                    System.out.println("Please insert a valid input");
                    break;
                    
            }
        }
    }

    private void menuAccountHolder(AccountHolder accHolder, ArrayList<AccountHolder> acc){
        Scanner sc = new Scanner(System.in);
        boolean logic = true;
        int switchHolder = 0;
        System.out.println("====Welcome " + accHolder.getName() +"====");
        while (logic) {
            System.out.println("===Account Menu===");
            System.out.println("1. Check Account Details\n2. Deposit\n3. Withdraw\n4. Transaction History\n5. Update Account Information\n6.Transfer to Account\n7.Back");
            switchHolder = sc.nextInt();
            switch (switchHolder) {
                case 1:
                    sc.nextLine();
                    accHolder.getAccount().displayAccountDetails();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter Ammount You Want To Deposit: ");
                    accHolder.getAccount().deposit(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter Ammount You Want To Withdraw: ");
                    accHolder.getAccount().withdraw(sc.nextDouble());
                    break;
                case 4:
                    sc.nextLine();
                    accHolder.getAccount().displayHistory();
                    break;
                case 5:
                    sc.nextLine();
                    accUpdate(accHolder);            
                case 6:
                    sc.nextLine();
                    accHolder.getAccount();
                case 7:
                    sc.nextLine();
                    logic = false;
                    break;
                default:
                    System.out.println("Please insert a legit input");
                    break;
            }
        }
    }

    private void menuBankOfficer(BankOfficer bnk,ArrayList<AccountHolder> acc){
        Scanner sc = new Scanner(System.in);
        boolean logic = true;
        int switchHolder = 0;
        System.out.println("====Welcome " + bnk.getName() +"====");
        while (logic) {
            System.out.println("===Bank Officer Menu===");
            System.out.println("1. Register Customer New Account\n2.Back");
            switchHolder = sc.nextInt();
            switch (switchHolder) {
                case 1:
                    sc.nextLine();
                    openCustAcc(acc);
                    break;
                case 2:
                    sc.nextLine();
                    logic = false;
                    break;
                default:
                    System.out.println("Please insert a legit input");
                    break;
            }
        }
    }

    private void menuFinanceOfficer(FinanceOfficer fin, Dividend div){
        Scanner sc = new Scanner(System.in);
        boolean logic = true;
        int switchHolder = 0;
        System.out.println("====Welcome " + fin.getName() + "====");
        while (logic) {
            System.out.println("===Finance Officer Menu===");
            System.out.println("1. Generate Report\n2. Set Divident Rate\n3.Back");
            switchHolder = sc.nextInt();
            switch (switchHolder) {
                case 1:
                    sc.nextLine();
                    //fin.something;;
                    break;
                case 2:
                    double divRate = 0;
                    System.out.println("Enter New Divident Rate: ");
                    div.dividentRateSet(divRate);
                case 3:
                    sc.nextLine();
                    logic = false;
                    break;
                default:
                    System.out.println("Please insert a legit input");
                    break;
            }
        }
    }

    private void menuAdministrator(Administrator adm,ArrayList<AccountHolder> acc, ArrayList<BankOfficer> bnk, ArrayList<FinanceOfficer> fin,  ArrayList<LoanOfficer> loa){
        Scanner sc = new Scanner(System.in);
        boolean logic = true;
        int switchHolder = 0;
        System.out.println("====Welcome " + adm.getName() +"====");
        while (logic) {
            System.out.println("===Bank Officer Menu===");
            System.out.println("1. Reset User password\n2.Back");
            switchHolder = sc.nextInt();
            switch (switchHolder) {
                case 1:
                    sc.nextLine();
                    passUpdate(adm, acc, bnk, fin, loa);
                    break;
                case 2:
                    sc.nextLine();
                    logic = false;
                    break;
                default:
                    System.out.println("Please insert a legit input");
                    break;
            }
        }
    }

    private void menuLoanOfficer(LoanOfficer loa){
        Scanner sc = new Scanner(System.in);
        boolean logic = true;
        int switchHolder = 0;
        System.out.println("====Welcome " + loa.getName() + "====");
        while (logic) {
            System.out.println("===Bank Officer Menu===");
            System.out.println("1. Loan Approval\n2.Back");
            switchHolder = sc.nextInt();
            switch (switchHolder) {
                case 1:
                    sc.nextLine();
                    //acc.
                    break;
                case 2:
                    sc.nextLine();
                    logic = false;
                    break;
                default:
                    System.out.println("Please insert a legit input");
                    break;
            }
        }
    }

    private void openCustAcc(ArrayList<AccountHolder> acc){
        Scanner scan = new Scanner(System.in);
        String name;
        String username;
        
        long ICNo;
        String phone;
        String gender;
        String Email;
        String password;
        
        System.out.println("Enter Full Name: " );
        name = scan.nextLine();
        //System.out.print("Enter IC Number : ");
        //ICNo = scan.nextInt(); BUAT PEMBETULAN DI SINI NANTI
        //scan.nextLong();
        System.out.println("Enter Phone number: ");
        phone = scan.nextLine();
        System.out.println("Enter Email");
        Email = scan.nextLine();
        System.out.println("Enter Username: " );
        username = scan.nextLine();
        System.out.println("Enter Password: ");
        password = scan.nextLine();

        AccountHolder accNew = new AccountHolder(name, null, null, 0, phone, null, Email, username, password, null, null);
        acc.add(accNew);
    }


    
    private void passUpdate(Administrator adm, ArrayList<AccountHolder> acc, ArrayList<BankOfficer> bnk, ArrayList<FinanceOfficer> fin,  ArrayList<LoanOfficer> loa){
        Scanner scan = new Scanner(System.in);
        
        String username;
        String password;
        System.out.println("Enter username: ");
        username = scan.nextLine();
        System.out.println("Enter new Password: ");
        password = scan.nextLine();

        if (username.length() < 3) {
            System.out.println("Invalid username format.");
            return;
        }

        String prefix = username.substring(0, 3).toUpperCase();

        switch (prefix) {
            case "FIN":
                boolean fB = false;
                int f = 0;
                for (int i = 0; i < fin.size(); i++) {
                    boolean userBool = fin.get(i).usernameChecker(username);
                    if (userBool){
                        f = i;
                        fB = true;
                    }
                }
                if (fB) {
                    FinanceOfficer finHold = fin.get(f);
                    finHold.reset(password);
                } else {
                    System.out.println("====No Person Found Under Username "+ username+"====");
                }
                break;
            case "LOA":
                boolean lB = false;
                int l = 0;
                for (int i = 0; i < fin.size(); i++) {
                    boolean userBool = fin.get(i).usernameChecker(username);
                    if (userBool){
                        f = i;
                        fB = true;
                    }
                }
                if (lB) {
                    LoanOfficer loaHold = loa.get(l);
                    loaHold.reset(password);
                } else {
                    System.out.println("====No Person Found Under Username "+ username+"====");
                }
                break;
            /*case "ADM":
                boolean aB = false;
                int a = 0;
                for (int i = 0; i < adm.size(); i++) {
                    boolean userBool = adm.get(i).usernameChecker(username);
                    if (userBool){
                        a = i;
                        aB = true;
                    }
                }
                if (aB) {
                    Administrator admHold = adm.get(a);
                    admHold.reset(password);
                } else {
                    System.out.println("====No Person Found Under Username "+ username+"====");
                }
                break;*/
            case "BNK":
                boolean bB = false;
                int b = 0;
                for (int i = 0; i < bnk.size(); i++) {
                    boolean userBool = bnk.get(i).usernameChecker(username);
                    if (userBool){
                        b = i;
                        bB = true;
                    }
                }
                if (bB) {
                    BankOfficer bnkHold = bnk.get(b);
                    bnkHold.reset(password);
                } else {
                    System.out.println("====No Person Found Under Username "+ username+"====");
                }
                break;
            default:
                break;
        }
    }

    
    private void accUpdate(AccountHolder acc) {
        Scanner scan = new Scanner(System.in);

        String phone;
        String Email;
        String street;
        int postcode;
        String city;
        String state;

        System.out.println("Enter Your Street Address: ");
        street = scan.nextLine();
        System.out.println("Enter Your Postcode: ");
        postcode = scan.nextInt();
        System.out.println("Enter Your City: ");
        city = scan.nextLine();
        System.out.println("Enter Your State: ");
        state = scan.nextLine();
        Address addressNew = new Address(street, postcode, city, state);
        System.out.println("Enter Phone number: ");
        phone = scan.nextLine();
        System.out.println("Enter Email");
        Email = scan.nextLine();

        acc.update(addressNew, phone, Email);
    }
}



