package april20.inheritanceexample;

public class BankDemoMain {
    public static void main(String[] args) {
        Rbc rbc = new Rbc(19087532,"Adam sandel",
                6.5,100,4.00);

        rbc.printBankDetails();
        rbc.MortgageRate();
        rbc.printRbcDetails();
    }
}
