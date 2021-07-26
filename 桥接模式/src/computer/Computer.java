package computer;

import brand.Brand;

public abstract class Computer {
    Brand brand;
   public abstract void  sale();

    public Computer(Brand brand) {
        this.brand = brand;
    }
}
