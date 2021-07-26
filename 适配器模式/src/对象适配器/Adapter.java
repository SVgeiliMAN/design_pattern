package 对象适配器;

//把TypeC变成Micro
public class Adapter implements TypeC {

    private MicroImpl micro;

    public Adapter(MicroImpl micro) {
        this.micro = micro;
    }

    @Override
    public void isTypeC() {
        micro.isMicro();
    }
}
