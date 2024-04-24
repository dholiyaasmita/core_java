package april23.abstraction;

public class Rbc extends BankOfCanada{

    public Rbc(int x) {
        super(x);
    }

    @Override
    public void rateOfInterest() {
        System.out.println("Basic banking interest rate of RBC bank is "+x+"%");
    }
}
