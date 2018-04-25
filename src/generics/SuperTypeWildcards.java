package generics;

import java.util.List;

public class SuperTypeWildcards {
	static <T> void writeTo(List<? super Fruit> fruit) {
		fruit.add(new Apple());
		fruit.add(new Orange());
		fruit.add(new Fruit());
	}
}
