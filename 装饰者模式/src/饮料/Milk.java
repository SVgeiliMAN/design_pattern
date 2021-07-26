package 饮料;

import 抽象.AbstractBeverage;

public class Milk extends AbstractBeverage {
    String description="牛奶";
    int cost=5;


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
