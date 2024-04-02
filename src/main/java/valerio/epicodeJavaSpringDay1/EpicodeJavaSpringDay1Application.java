package valerio.epicodeJavaSpringDay1;

import beans.AppBeans;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EpicodeJavaSpringDay1Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppBeans.class);
        List<MenuItem> items = getMenuItem(context);
        List<Topping> toppings = context.getBean("toppings", List.class);
        List<Beverage> beverages = context.getBean("beverages", List.class);

        Menu menu = new Menu(items, toppings, beverages);
        printMenu(menu);

    }

    private static List<MenuItem> getMenuItem(AnnotationConfigApplicationContext context) {
        List<MenuItem> items = new ArrayList<>();
        items.add(context.getBean("margherita", Pizza.class));
        items.add(context.getBean("salamiPizza", Pizza.class));
        return items;
    }

    private static void printMenu(Menu menu) {
        System.out.println("menu:");

        for (MenuItem item : menu.getMenu()) {
            if (item instanceof Pizza) {
                Pizza pizza = (Pizza) item;
                System.out.println("Pizza: " + pizza.getName() + " " + pizza.getPrice());
                System.out.println("Nutrition: " + pizza.getInfoNutrition().getCalories() + " calories");
                System.out.println("Toppings:");
                for (Topping topping : pizza.getToppings()) {
                    System.out.println(topping.getName());
                }
                System.out.println("dispobile maxi pizza");
                System.out.println("xl:" + pizza.isXL());
                System.out.println("------------------------------------------------------------------------");
                ;
            }
        }

        System.out.println("topping disponibili:");
        for (Topping topping : menu.getToppings()) {
            System.out.println(topping.getName() + " " + " calorie: " + " " + topping.getCalories() + " " + "prezzo: " + topping.getPrice());

        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("beverage disponibili:");
        for (Beverage beverage : menu.getBeverages()) {
            System.out.println(beverage.getName() + " " + " prezzo: " + beverage.getPrice() + " " + "calorie" + " " + beverage.getCalories());
        }

    }
}
