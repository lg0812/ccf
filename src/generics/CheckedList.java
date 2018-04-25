package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author LG0812
 *         <p>
 *         动态类型安全
 *         </p>
 */
public class CheckedList {
	static void oldStyleMethod(List probablyDogs) {
		probablyDogs.add(new Fruit());
	}

	public static void main(String[] args) {
		List<Fruit> fruit = Collections.checkedList(new ArrayList<Fruit>(), Fruit.class);
	}
}
