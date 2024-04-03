package valerio.epicodeJavaSpringDay1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import valerio.epicodeJavaSpringDay1.Enum.OrderStatus;
import valerio.epicodeJavaSpringDay1.Enum.TableStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@PropertySource("application.properties")
public class OrderRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(OrderRunner.class);

    @Value("${cover.charge}")
    private double coverCharge;

//    private Order createOrder() {
//        Order order = new Order();
//        order.setOrderNumber(1);
//        order.setStatus(OrderStatus.IN_PROGRESS);
//        order.setTable(new Table(1, ));
//        order.setAcquisitionTime(LocalDateTime.now());
//
//        order.addItem(menu.getMenu().get(0));
//        order.addItem(menu.getMenu().get(1));
//
//        double total = order.calculateTotalPrice();
//        total += coverCharge;
//        order.setTotalPrice(total);
//
//        return order;
//    }


    @Override
    public void run(String... args) {

        List<Menu> menu = Arrays.asList();


        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Cheese", 100, 0.99));
        toppings.add(new Topping("Ham", 100, 0.99));
        toppings.add(new Topping("Onions", 100, 0.99));
        toppings.add(new Topping("Salami", 100, 0.99));
        toppings.add(new Topping("mozzarella", 110, 0.99));
        toppings.add(new Topping("tomato", 100, 0.99));

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

        Order order = new Order();
        order.setOrderNumber(1);
        order.setStatus(OrderStatus.IN_PROGRESS);
        order.setTable(new Table(1, 2, TableStatus.OCCUPATED));
        order.setAcquisitionTime(LocalDateTime.now());
        order.addItem(menu.getMenu().get(0));
        order.addItem(menu.getMenu().get(1));
        double total = order.calculateTotalPrice();
        total += coverCharge;
        order.setTotalPrice(total);

        logger.info("Order Number: {}", order.getOrderNumber());
        logger.info("Status: {}", order.getStatus());
        logger.info("Table Number: {}", order.getTable().getNumber());
        logger.info("Cover Charge: {}", coverCharge);
        logger.info("Acquisition Time: {}", order.getAcquisitionTime());
        logger.info("Items:");
        for (MenuItem item : order.getItems()) {
            logger.info("- {} (Price: {}, Calories: {})", item.getName(), item.getPrice(), item.getCalories());
        }
        logger.info("Total Price: {}", order.getTotalPrice());
    }
}
