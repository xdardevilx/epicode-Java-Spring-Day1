package valerio.epicodeJavaSpringDay1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Menu {
    private List<MenuItem> menu;
    private List<Topping> toppings;
    private List<Beverage> beverages;


    public Menu(List<MenuItem> menu, List<Topping> toppings, List<Beverage> beverages) {
        this.menu = menu;
        this.toppings = toppings;
        this.beverages = beverages;
    }
}
