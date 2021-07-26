package 简单工厂模式;

public class PhoneFactory {
    public Phone makePhone(Class clazz){
        if (clazz==MiPhone.class){
            return new MiPhone();
        }else if (clazz==Iphone.class){
            return new Iphone();
        }else {
            return null;
        }

    }
}
