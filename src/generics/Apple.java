package generics;

public class Apple extends Fruit {
    public String type;
    public int weight;
    public String color;

    public Apple() {
    }

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Apple(String fruitName) {
        // TODO Auto-generated constructor stub
        super(fruitName);
    }

    public static void main(String[] args) {
        Apple a = new Apple("apple");
        System.out.println(a.getFruitName());
        System.out.println(a.weight);

    }

    @Override
    public String toString() {
        return "weight:" + this.weight + " color:" + this.color;
    }
}
