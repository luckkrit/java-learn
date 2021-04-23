package ch10_13.lab3;

class AI extends Employee implements IWebsiteCreator {

    public AI(String firstName, String lastName) {
        super(firstName, lastName, 0);
    }

    @Override
    public void createWebsite() {

    }
}

public class InterfaceCasting {
    public static void main(String[] args) {
        CEO ceo = new CEO("Captain", "Marvel", 30000);
        IWebsiteCreator dang = new Programmer("Dang", "Marvel", 30000);
        Programmer dang2 = (Programmer) dang;
        AI alhpaGo = new AI("alphaGo", "Java");
        IWebsiteCreator alphaGo2 = alhpaGo;
        ceo.orderWebsite(dang);
        ceo.orderWebsite(dang2);
        ceo.orderWebsite(alhpaGo);
        ceo.orderWebsite(alphaGo2);
    }
}
