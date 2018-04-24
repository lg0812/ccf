package generics;

import java.lang.reflect.Array;

public class GenericArray<T> {
	private T[] array;

	@SuppressWarnings("unchecked")
	public GenericArray(Class<T> type, int sz) {
		array = (T[]) Array.newInstance(type, sz);
	}

	public void put(int index, T item) {
		array[index] = item;
	}

	public T get(int index) {
		return array[index];
	}

	public T[] rep() {
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericArray<Integer> gai = new GenericArray<Integer>(Integer.class, 10);
		gai.put(0, 100);
		Integer[] oa = gai.rep();
		System.out.println(oa[0]);
	}
}
