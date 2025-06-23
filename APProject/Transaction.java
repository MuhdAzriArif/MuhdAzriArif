public class Transaction {
    private String transactionID;
    private String TransacDate;
    private String TransacType;
    private double transacAmount;

    
    public Transaction(String transactionID, String TransacDate, String TransacType, double transacAmount) {
        this.transactionID = transactionID;
        this.TransacDate = TransacDate;
        this.TransacType = TransacType;
        this.transacAmount = transacAmount;
    }

    public void getTransactionDetails() {
        System.out.println("---Transaction Details---");
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("\tAmount: " + transacAmount);
        System.out.println("\tType: " + TransacType);
        System.out.println("\tDate: " + TransacDate);
    }

    public void displayHistory(BankAccount BankAcc){
        BankAcc.displayHistory();
    }
}

