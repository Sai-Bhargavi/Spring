package org.bhargavi;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    public String getBrand() {
        return brand;
    }
/*

    Tyre(String Brand) {
        this.brand = Brand;
    }
*/

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    @Override
    public String toString() {
        return "its working....";
    }
}
