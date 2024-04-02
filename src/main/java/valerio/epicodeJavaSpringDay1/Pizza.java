package valerio.epicodeJavaSpringDay1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza extends MenuItem {

    private List<Topping> toppings;
    private boolean isXL;
    private InfoNutrition infoNutrition;

    public Pizza() {
    }

    ;

    public Pizza(String name, double price, int calories, List<Topping> toppings, boolean isXL, InfoNutrition infoNutrition) {
        super(name, price, calories);
        this.toppings = toppings;
        this.isXL = isXL;
        this.infoNutrition = infoNutrition;
    }

    public boolean isXL() {
        return isXL;
    }
}
