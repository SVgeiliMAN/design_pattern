
package 工厂方法模式;

public class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造了一台小米手机");
    }
}
