import java.util.ArrayList;

public class BankAccount {
    private long accNumber;
    private double balance;
    private int pinNumber;
    private ArrayList<Transaction> withdraw;
    private ArrayList<Transaction> deposit;

    public BankAccount(long accNumber, double balance, int pinNumber) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public void createAccount(){
        
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: " + accNumber);
        System.out.printf("\nCurrent Balance: %.2f",  balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        }
        else balance =- amount;
        Transaction transWithdraw = new Transaction(null, null, "Withdraw", amount);
        withdraw.add(transWithdraw);
    }

    public void deposit(double amount) {
        balance =+ amount;
        Transaction transDeposit = new Transaction(null, null, "Deposit", amount);
        deposit.add(transDeposit);
    }


    public void displayReport(){
        System.out.println("WITHDRAW: ");

            if(withdraw.isEmpty()){
                System.out.println("NO WITHDRAW DONE");
            }
            else{
                System.out.println("WITHDRAW: ");
                for (int i = 0; i < withdraw.size(); i++) {
                    withdraw.get(i).getTransactionDetails();
                    System.out.println(" | [ Withdraw ID(" + (i+1) + ") ]");
                }
            }
        
        System.out.println("DEPOSIT: ");

            if(withdraw.isEmpty()){
                System.out.println("NO DEPOSIT DONE");
            }
            else{
                System.out.println("DEPOSIT: ");
                for (int i = 0; i < deposit.size(); i++) {
                    deposit.get(i).getTransactionDetails();
                    System.out.print(" | [ Deposit ID(" + (i+1) + ") ]");
                }
            }
    }
    public void displayHistory(){
        System.out.println("====TRANSACTION HISTORY====");
            displayReport();
        }
    }