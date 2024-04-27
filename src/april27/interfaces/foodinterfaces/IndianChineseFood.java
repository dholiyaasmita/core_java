package april27.interfaces.foodinterfaces;

public class IndianChineseFood implements IndianFood,ChineseFood{

    @Override
    public void recipe() {
        System.out.println("indian food recipe ..");

    }

    @Override
    public void presentationOfFood() {
        System.out.println("indian food recipe ..");

    }

    @Override
    public void spoons() {
        System.out.println("indianchinese food recipe ..");

    }
}
