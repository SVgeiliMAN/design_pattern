import 抽象.AbstractBeverage;
import 调料.Pearls;
import 调料.RedBean;
import 调料.Shit;
import 饮料.Coffee;
import 饮料.Milk;

public class Test {
    public static void main(String[] args) {
        AbstractBeverage beverage;
        beverage= new Milk();
        beverage= new Pearls(beverage);
        beverage= new Pearls(beverage);
        beverage= new Shit(beverage);
        beverage= new RedBean(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());

        AbstractBeverage beverage1;
        beverage1 = new Coffee();
        beverage1= new RedBean(beverage1);
        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.getCost());
    }
}
