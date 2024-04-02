package valerio.epicodeJavaSpringDay1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping {
    private String name;

    public Topping() {};

    public Topping(String name) {
        this.name = name;
    }
}
