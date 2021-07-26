package 观察者;

public class ConcreteObserver extends AbstractObserver {
    @Override
    public void tell() {
        System.out.println("观察者观察到了");
    }
}