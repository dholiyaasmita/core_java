package april20.inheritanceexample;

public class Bank {
    double accountNUmber;
    String accountInfo;


    public Bank(double accountNUmber, String accountInfo) {
        this.accountNUmber = accountNUmber;
        this.accountInfo = accountInfo;
    }

    public void printBankDetails(){
        System.out.println("Printing Bank details: ");
        System.out.println("Account NUmber: "+accountNUmber);
        System.out.println("Account Info: "+ accountInfo);
    }
}
