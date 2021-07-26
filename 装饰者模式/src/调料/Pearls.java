package 调料;

import 抽象.AbstractBeverage;

public class Pearls extends CondimentDecorator {
    String description = "珍珠";
    int cost = 2;
    AbstractBeverage beverage;
    public Pearls(AbstractBeverage beverage) {
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
