import java.util.HashMap;

//复合享元
public class ConcreteCompositeFlyweight implements Flyweight {
    HashMap map = new HashMap();
    @Override
    public void operation(int state) {

    }
    public void add(int key,Flyweight Flyweight){
        map.put(key,Flyweight);
    }
}
