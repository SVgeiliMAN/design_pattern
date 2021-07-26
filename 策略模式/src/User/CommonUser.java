package User;

public class CommonUser extends User {

    @Override
    public double getPrice(double price) {
        System.out.println("普通用户，没有折扣");
        return price;
    }
}
