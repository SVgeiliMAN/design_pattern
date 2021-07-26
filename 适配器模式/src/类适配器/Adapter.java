package 类适配器;

//把TypeC变成Micro
public class Adapter extends MicroImpl implements TypeC {

    @Override
    public void isTypeC() {
        isMicro();
    }
}
