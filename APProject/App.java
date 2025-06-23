import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        AccountHolder acc1 = new AccountHolder("Azri", null, null, 0, null, null, null, "Azriarif", "www", null, null);
        ArrayList<AccountHolder> acc = new ArrayList<>();
        acc.add(acc1);
        Dividend div = new Dividend(2.5);
        ArrayList<BankOfficer> bnk = new ArrayList<>();
        BankOfficer bnk1 = new BankOfficer("Lukhi", null, null, 0, null, null, null, "bnkLukh", "SayasukaOreo", null, null, null, div);
        bnk.add(bnk1);
        ArrayList<FinanceOfficer> fin = new ArrayList<>();
        FinanceOfficer fin1 = new FinanceOfficer("Kim", null, null, 0, null, null, null,"finKimKorea","test", null, null, null, div);
        fin.add(fin1);
        ArrayList<LoanOfficer> loa = new ArrayList<>();
        LoanOfficer loa1 = new LoanOfficer("JJ", null, null, 0, null, null, null, "loajeremysukadilf","Ejenrizwanhensem", null, null, null);
        loa.add(loa1);
        ArrayList<Administrator> adm = new ArrayList<>();
        Administrator adm1 = new Administrator("Hasif Penyu", null, null, 0, null, null, null, "admhasifharapanpermata", "bertindaksegera", null, null, null, div);
        adm.add(adm1);
        menu.mainMenu(acc, bnk, fin, loa, adm, div);
    }
}
