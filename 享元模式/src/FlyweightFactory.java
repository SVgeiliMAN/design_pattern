import java.util.HashMap;
import java.util.List;

public class FlyweightFactory {
    HashMap flyweights=new HashMap();
    Flyweight getFlyweight(int key){
        if (flyweights.containsKey(key)){
            return (Flyweight) flyweights.get(key);
        }else {
            ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight(key);
            flyweights.put(key,concreteFlyweight);
            return concreteFlyweight;
        }
    }
    //复合享元
    Flyweight getFlyweight(List<Integer> compositeState){
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();
        for (int i : compositeState) {
            concreteCompositeFlyweight.add(i,this.getFlyweight(i));
        }
        return concreteCompositeFlyweight;
    }
}
