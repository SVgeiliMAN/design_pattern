package 订阅者;

import 观察者.AbstractObserver;

import java.util.ArrayList;

public class ConcreteSubject extends AbstractSubject {
    ArrayList<AbstractObserver> list = new ArrayList();

    public void addObserver(AbstractObserver observer) {
        list.add(observer);
    }
    public void deleteObserver(AbstractObserver observer){
        list.remove(observer);
    }
    public void notifyObserver(){
        for (AbstractObserver observer: list) {
            observer.tell();
        }
    }
    public void doSomething(){
        System.out.println("订阅者做了一些事情");
        this.notifyObserver();
    }
}
