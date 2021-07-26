public class ConcreteFlyweight implements Flyweight {
    private int intrinsicState = 0;

    public ConcreteFlyweight(int intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(int state) {
        System.out.println("内蕴状态"+this.intrinsicState);
        System.out.println("外蕴状态"+state);

    }
}
