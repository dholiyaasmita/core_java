package april23.abstraction;

public abstract class BankOfCanada {

    int x;

    public BankOfCanada(int x) {
        this.x = x;
        //System.out.println(x);
    }

    public abstract void rateOfInterest();
}
