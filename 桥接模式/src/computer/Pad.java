package computer;

import brand.Brand;

public class Pad extends Computer {
    public Pad(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println("售卖pad");
        brand.sale();
    }
}
