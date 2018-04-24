package generics;

public class ArrayOfGenericReference {
	static Generic<Integer>[] gia;
	static final int SIZE = 100;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		gia = new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		gia[0] = new Generic<Integer>();
		// gia[1] = new Object();
		// gia[2] = new Generic<Double>();
	}
}
