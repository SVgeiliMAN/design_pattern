import builder.ComputerBuilder;
import director.Boss;
import product.Computer;

import java.util.Iterator;

public class BuyComputer {
    public static void main(String[] args) {
        Boss boss = new Boss();
        ComputerBuilder computerBuilder = new ComputerBuilder();
        boss.builder(computerBuilder);
        Computer computer = computerBuilder.getComputer();
        Iterator iterator = computer.iterator();
        System.out.println("电脑里面有什么？");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
