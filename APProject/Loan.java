import java.time.LocalDate;

public class Loan{
    private String loanID;
    private double loanAmount;
    private double interestrate;
    private int loanDuration;
    private String loanType;
    private LocalDate applicationDate;
    private String loanStatus;

    public Loan(String loanID, double loanAmount, double interestrate, int loanDuration, String loanType,
            LocalDate applicationDate, String loanStatus) {
        this.loanID = loanID;
        this.loanAmount = loanAmount;
        this.interestrate = interestrate;
        this.loanDuration = loanDuration;
        this.loanType = loanType;
        this.applicationDate = applicationDate;
        this.loanStatus = loanStatus;
    }

    public String getLoanId() {
        return loanID;
    }

    public String getStatus() {
        return loanStatus;
    }

    public void setStatus(String status) {
        this.loanStatus = loanStatus;
    }

    public void displayLoanDetails(){
        System.out.println("---Loan Details---");
        System.out.println("Loan ID: " +loanID);
        System.out.println("\tAmount" +loanAmount);
        System.out.println("\tDuration" +loanDuration);
        System.out.println("\tType" +loanType);
        System.out.println("\tStatus" +loanStatus);
    }
    
}