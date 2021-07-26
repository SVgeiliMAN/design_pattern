package 具体子类;
import 抽象父类.*;

public class FireRadishes extends  AbstractCooking{
    @Override
    public void clean() {
        System.out.println("清洗萝卜");
    }

    @Override
    public void addWater() {
        System.out.println("加水");
    }

    @Override
    public void fire() {
        System.out.println("开炒");
    }

    @Override
    public void finished() {
        System.out.println("完成");
    }
}
