package 对象适配器;

public class Test {
    public static void main(String[] args) {
        TypeC typeC = new Adapter(new MicroImpl());
        typeC.isTypeC();

    }
}
