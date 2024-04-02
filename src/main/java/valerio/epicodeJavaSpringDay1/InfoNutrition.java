package valerio.epicodeJavaSpringDay1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoNutrition {
    private int calories;

    public InfoNutrition(int calories) {
        this.calories = calories;
    }
}
