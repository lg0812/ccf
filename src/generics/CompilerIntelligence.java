package generics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CompilerIntelligence {
	public static void main(String[] args) {
		List<? extends Fruit> fruit = Arrays.asList(new Apple());
		HashSet s = new HashSet<>();
		HashMap map = new HashMap();
		Apple a = (Apple) fruit.get(0);
		// fruit.add(new Orange());
		fruit.contains(a);
		fruit.indexOf(a);
	}

}
