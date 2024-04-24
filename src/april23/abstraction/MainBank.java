package april23.abstraction;

public class MainBank {

    public static void main(String[] args) {
        BankOfCanada bank = new Rbc(10);
        bank.rateOfInterest();

        BankOfCanada bankScotia = new Scotia(12);
        bankScotia.rateOfInterest();
    }
}
