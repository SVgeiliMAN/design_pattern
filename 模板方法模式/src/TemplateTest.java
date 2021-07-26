import 具体子类.FireRadishes;
import 抽象父类.AbstractCooking;

public class TemplateTest {
    public static void main(String[] args) {
        AbstractCooking abstractCooking = new FireRadishes();
        abstractCooking.cooking();

    }
}
