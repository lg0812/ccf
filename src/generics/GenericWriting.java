package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
	static <T> void writeExact(List<T> list, T item) {
		list.add(item);
	}

	static List<Apple> apples = new ArrayList<Apple>();
	static List<Fruit> fruit = new ArrayList<Fruit>();

	static void f1() {
		writeExact(apples, new Apple());
		// writeExact(apples, new Fruit());
	}

	static <T> void writeWildcard(List<? super T> list, T item) {
		list.add(item);
	}

	static void f2() {
		writeWildcard(apples, new Apple());
		writeWildcard(fruit, new Fruit());
	}

	public static void main(String[] args) {
		f1();
		f2();
	}
}
