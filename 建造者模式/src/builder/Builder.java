package builder;

import product.Computer;

public abstract class Builder {
    public abstract void build();

    public abstract void buildCPU();
    public abstract void buildMainBoard();
    public abstract void buildMainHD();
    public abstract Computer getComputer();




}
