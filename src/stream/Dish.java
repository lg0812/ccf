package stream;

import java.lang.reflect.Type;

public class Dish {
    public int calories;
    public String name;
    public boolean vegetarian;

    public Dish(int calories, String name) {
        this.calories = calories;
        this.name = name;
    }

    public Dish(int calories, String name, boolean vegetarian) {
        this.calories = calories;
        this.name = name;
        this.vegetarian = vegetarian;
    }
}
