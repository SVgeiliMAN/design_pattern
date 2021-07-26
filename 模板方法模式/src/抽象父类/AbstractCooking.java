package 抽象父类;

public abstract class AbstractCooking {
    public final void cooking(){
        addWater();
        clean();
        fire();
        finished();
    }

    public abstract void clean();
    public abstract void addWater();
    public abstract void fire();
    public abstract void finished();
}
