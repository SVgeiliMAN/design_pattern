import User.User;

public class Price {
    User user;

    public Price(User user) {
        this.user = user;
    }
    double getPrice(double price){
        double price1 = user.getPrice(price);
        System.out.println(price1);
        return price1;
    }
}
