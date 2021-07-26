import 观察者.ConcreteObserver;
import 订阅者.ConcreteSubject;

public class Client {
    public static void main(String[] args) {
        ConcreteObserver concreteObserver = new ConcreteObserver();
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.addObserver(concreteObserver);
        concreteSubject.doSomething();
    }
}
