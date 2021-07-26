import User.CommonUser;
import User.Vip9;

public class Test {
    public static void main(String[] args) {
        Price price = new Price(new Vip9());
        price.getPrice(20);
        System.out.println("===========================================");
        Price price1 = new Price(new CommonUser());
        price1.getPrice(20);
    }
}
