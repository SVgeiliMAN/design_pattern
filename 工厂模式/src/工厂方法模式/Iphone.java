package 工厂方法模式;

public class Iphone implements Phone {
    public Iphone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造了一台苹果手机");
    }
}