package april20.inheritanceexample;

public class Rbc extends BankOfCanada{
    double minimumDeposit;
    double serviceFees;

    public Rbc(double accountNUmber, String accountInfo, double mortgageRate, double minimumDeposit, double serviceFees) {
        super(accountNUmber, accountInfo, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.serviceFees = serviceFees;
    }

    public void printRbcDetails(){
        System.out.println("priting RBC details: ");
        System.out.println("Minimum Deposit: "+minimumDeposit);
        System.out.println("Service fees: "+serviceFees);
    }

}
