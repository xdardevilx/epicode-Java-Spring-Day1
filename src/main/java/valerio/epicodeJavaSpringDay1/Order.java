package valerio.epicodeJavaSpringDay1;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import valerio.epicodeJavaSpringDay1.Enum.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {
    private static final Logger logger = LoggerFactory.getLogger(Order.class);
    private int orderNumber;
    private OrderStatus status;
    private Table table;
    private LocalDateTime acquisitionTime;
    private List<MenuItem> items = new ArrayList<>();
    private double totalPrice;

    public Order() {
    }

    ;

    public Order(int orderNumber, OrderStatus status, Table table, LocalDateTime acquisitionTime, List<MenuItem> items, double totalPrice) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.table = table;
        this.acquisitionTime = acquisitionTime;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }


}
