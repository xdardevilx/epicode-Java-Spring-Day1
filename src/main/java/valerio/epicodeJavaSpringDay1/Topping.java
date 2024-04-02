package valerio.epicodeJavaSpringDay1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping {
    private String name;

    private int calories;

    private double price;

    public Topping() {
    }

    ;

    public Topping(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}
