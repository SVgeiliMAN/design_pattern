package 工厂方法模式;

public class IphoneFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new Iphone();
    }
}
