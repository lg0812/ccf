package generics;

public class HoldItem<T> {
	T item;

	public HoldItem(T item) {
		// TODO Auto-generated constructor stub
		this.item = item;
	}

	T getItem() {
		return this.item;
	}
}
