package april20.inheritanceexample;

public class BankOfCanada extends Bank{
    double mortgageRate;


    public BankOfCanada(double accountNUmber, String accountInfo, double mortgageRate) {
        super(accountNUmber, accountInfo);
        this.mortgageRate = mortgageRate;
    }

    public void MortgageRate(){
        System.out.println("The Mortgage rate of bank of canada is 5%.");
    }
}
