package valerio.epicodeJavaSpringDay1;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beverage extends MenuItem {
    private String name;
    private double calorie;
    private double price;

    public Beverage() {
    }

    ;

    public Beverage(String name, double price, int calories, String name1, double calorie, double price1) {
        super(name, price, calories);
        this.name = name1;
        this.calorie = calorie;
        this.price = price1;
    }
}
