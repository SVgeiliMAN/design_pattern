package 调料;

import 抽象.AbstractBeverage;

public class Shit extends AbstractBeverage {
    AbstractBeverage beverage;

    public Shit(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    String description = "屎";
    int cost = 1;


    @Override
    public String getDescription() {
        return description+"+"+beverage.getDescription();
    }

    @Override
    public int getCost() {
        return cost+beverage.getCost();
    }

}
