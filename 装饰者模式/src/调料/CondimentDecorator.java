package 调料;
import 抽象.AbstractBeverage;
public  abstract class CondimentDecorator extends AbstractBeverage {
    AbstractBeverage beverage;
    String description;
    int cost;

    public abstract String getDescription();
    public abstract int getCost();

}
