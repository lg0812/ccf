package generics;

import java.util.ArrayList;
import java.util.List;

public class NonCovariantGenerics {
	List<? extends Fruit> f = new ArrayList<Apple>();
}
