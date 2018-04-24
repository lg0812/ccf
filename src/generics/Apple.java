package generics;

public class Apple extends Fruit {
	public String type;

	public Apple(String fruitName) {
		// TODO Auto-generated constructor stub
		super(fruitName);
	}

	public static void main(String[] args) {
		Apple a = new Apple("apple");
		System.out.println(a.getFruitName());
		System.out.println(a.weight);

	}
}
