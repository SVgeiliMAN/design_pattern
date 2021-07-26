package 简单工厂模式;

public class Test {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.makePhone(MiPhone.class);

    }
}
