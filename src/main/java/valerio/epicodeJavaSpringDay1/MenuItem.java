package valerio.epicodeJavaSpringDay1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class MenuItem {
    private String name;
    private double price;
    private int calories;

    public MenuItem() {};

    public MenuItem(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}
