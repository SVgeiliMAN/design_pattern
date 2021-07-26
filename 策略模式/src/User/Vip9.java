package User;

public class Vip9 extends User{


    @Override
    public double getPrice(double price) {
        System.out.println("会员给你打九折");
        return 0.9*price;
    }
}
