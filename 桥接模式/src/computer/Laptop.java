package computer;

import brand.Brand;

public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println("售卖手提电脑");
        brand.sale();
    }
}
