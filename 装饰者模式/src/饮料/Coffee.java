package 饮料;

import 抽象.AbstractBeverage;

public class Coffee extends AbstractBeverage {
    String description="咖啡";
    int cost=8;


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
