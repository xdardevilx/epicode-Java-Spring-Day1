package valerio.epicodeJavaSpringDay1;

import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"valerio.epicodeJavaSpringDay1", "valerio.epicodeJavaSpringDay1.beans"})
public class EpicodeJavaSpringDay1Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);


    }

}


//
//    }
//
//    private static List<MenuItem> getMenuItem(AnnotationConfigApplicationContext context) {
//        List<MenuItem> items = new ArrayList<>();
//        items.add(context.getBean("margherita", Pizza.class));
//        items.add(context.getBean("salamiPizza", Pizza.class));
//        return items;
//    }
//
//    private static void printMenu(Menu menu) {
//        System.out.println("menu:");
//
//        for (MenuItem item : menu.getMenu()) {
//            if (item instanceof Pizza) {
//                Pizza pizza = (Pizza) item;
//                System.out.println("Pizza: " + pizza.getName() + " " + pizza.getPrice());
//                System.out.println("Nutrition: " + pizza.getInfoNutrition().getCalories() + " calories");
//                System.out.println("Toppings:");
//                for (Topping topping : pizza.getToppings()) {
//                    System.out.println(topping.getName());
//                }
//                System.out.println("dispobile maxi pizza");
//                System.out.println("xl:" + pizza.isXL());
//                System.out.println("------------------------------------------------------------------------");
//                ;
//            }
//        }
//
//        System.out.println("topping disponibili:");
//        for (Topping topping : menu.getToppings()) {
//            System.out.println(topping.getName() + " " + " calorie: " + " " + topping.getCalories() + " " + "prezzo: " + topping.getPrice());
//
//        }
//
//        System.out.println("---------------------------------------------------------------------------");
//        System.out.println("beverage disponibili:");
//        for (Beverage beverage : menu.getBeverages()) {
//            System.out.println(beverage.getName() + " " + " prezzo: " + beverage.getPrice() + " " + "calorie" + " " + beverage.getCalories());
//        }
//
