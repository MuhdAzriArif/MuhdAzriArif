public class Dividend{
    private double divRate;

    public Dividend(double divRate){
        this.divRate = divRate;
    }

    public double calcDiv(BankAccount Bankacc){
        return Bankacc.getBalance() * divRate;
    }

    public void displayDiv(BankAccount Bankacc){
        System.out.println("Dividend amount: " + calcDiv(Bankacc));
        System.out.println("Dividend rate: " + divRate);
    }

    public void dividentRateSet(double divRate){
        this.divRate = divRate;
    }

    public void displayDiv(){
        System.out.println("DIVIDEND: " + divRate);
    }
}
