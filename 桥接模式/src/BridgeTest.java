import brand.Dell;
import computer.Computer;
import computer.Desktop;

public class BridgeTest {
    public static void main(String[] args) {
        Desktop desktop = new Desktop(new Dell());
        desktop.sale();
    }
}
