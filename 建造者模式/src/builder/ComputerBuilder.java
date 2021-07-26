package builder;

import product.Computer;

public class ComputerBuilder extends Builder {
    Computer<String> computer = new Computer<String>();
    @Override
    public void build() {
        buildCPU();
        buildMainBoard();
        buildMainHD();
    }

    @Override
    public void buildCPU() {
        computer.add("cpu");

    }

    @Override
    public void buildMainBoard() {
        computer.add("主板");


    }

    @Override
    public void buildMainHD() {
        computer.add("硬盘");

    }

    @Override
    public Computer getComputer() {
        System.out.println("电脑组装好了");
        return computer;
    }
}
