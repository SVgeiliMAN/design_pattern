package 工厂方法模式;

public class MiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}
