package stream;

public class Dish {
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

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
