package april23.abstraction;

public class Scotia extends BankOfCanada{

    public Scotia(int x) {
        super(x);
    }

    @Override
    public void rateOfInterest() {
        System.out.println("Basic banking interest rate of Scotia bank is "+x+"%");

    }
}
