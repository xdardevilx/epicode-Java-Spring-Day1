package valerio.epicodeJavaSpringDay1.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import valerio.epicodeJavaSpringDay1.*;
import valerio.epicodeJavaSpringDay1.Enum.TableStatus;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "valerio.epicodeJavaSpringDay1")
public class AppBeans {

    @Bean
    public Pizza margherita() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("mozzarella", 110, 0.99));
        toppings.add(new Topping("tomato", 100, 0.99));
        return new Pizza("margherita", 4.99, 1104, toppings, false, new InfoNutrition(1104));
    }


    @Bean
    public Pizza salamiPizza() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("mozzarella", 110, 0.99));
        toppings.add(new Topping("tomato", 100, 0.99));
        toppings.add(new Topping("salami", 100, 0.99));
        return new Pizza("salamiPizza", 4.99, 1160, toppings, true, new InfoNutrition(1160));
    }

    @Bean
    public List<Topping> toppings() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Cheese", 100, 0.99));
        toppings.add(new Topping("Ham", 100, 0.99));
        toppings.add(new Topping("Onions", 100, 0.99));
        toppings.add(new Topping("Salami", 100, 0.99));
        return toppings;
    }

    @Bean
    public List<Beverage> beverages() {
        List<Beverage> beverages = new ArrayList<>();
        Beverage lemonade = new Beverage();
        lemonade.setName("Lemonade (0.33l)");
        lemonade.setPrice(1.99);
        lemonade.setCalories(120);
        beverages.add(lemonade);

        Beverage Water = new Beverage();
        Water.setName("Water (0.5l)");
        Water.setPrice(1.99);
        Water.setCalories(0);
        beverages.add(Water);

        Beverage wine = new Beverage();
        wine.setName("Wine (0.75l 13%)");
        wine.setPrice(1.99);
        wine.setCalories(607);
        beverages.add(wine);

        return beverages;

    }

    @Bean
    public Menu createMenu(List<MenuItem> menu, List<Topping> toppings, List<Beverage> beverages) {
        return new Menu(menu, toppings, beverages);
    }

    @Bean
    public Table createTable() {
        return new Table(1, 4, TableStatus.FREE);
    }
}
