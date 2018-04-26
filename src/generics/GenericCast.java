package generics;

class FixedSizStack<T> {
	private int index = 0;
	private Object[] storage;

	public FixedSizStack(int size) {
		storage = new Object[size];
	}

	public void push(T item) {
		this.storage[index++] = item;
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		return (T) this.storage[--index];
	}
}

public class GenericCast {
	private static final int SIZE = 10;

	public static void main(String[] args) {
		FixedSizStack<String> strings = new FixedSizStack<String>(SIZE);
		for (String s : "A B C D E F G H I J".split(" ")) {
			strings.push(s);
		}
		for (int i = 0; i < SIZE; i++) {
			String s = strings.pop();
			System.out.println(s);
		}
	}
}
