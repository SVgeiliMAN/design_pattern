package computer;

import brand.Brand;

public class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println("售卖台式机");
        brand.sale();
    }
}
