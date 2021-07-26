package 类适配器;

public class MicroImpl implements Micro {
    @Override
    public void isMicro() {
        System.out.println("我是micro接口");
    }
}
