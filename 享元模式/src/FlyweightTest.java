public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        System.out.println(flyweightFactory.getFlyweight(1));
        System.out.println(flyweightFactory.getFlyweight(2));
        System.out.println(flyweightFactory.getFlyweight(2));
        System.out.println(flyweightFactory.getFlyweight(1));


    }
}
