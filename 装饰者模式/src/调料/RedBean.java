package 调料;

import 抽象.AbstractBeverage;

public class RedBean extends AbstractBeverage {
    String description = "红豆";
    int cost = 3;
    AbstractBeverage beverage;
    public RedBean(AbstractBeverage beverage) {
        this.beverage=beverage;
    }


    @Override
    public String getDescription() {
        return description+"+"+beverage.getDescription();
    }

    @Override
    public int getCost() {
        return cost+beverage.getCost();
    }
}
