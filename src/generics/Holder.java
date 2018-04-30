package generics;

public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<Apple>(new Apple());
        Apple d = apple.get();
        apple.set(d);
        // Holder<Fruit> fruit = apple;
        Holder<? extends Fruit> f = apple;
        Fruit p = f.get();
        d = (Apple) f.get();

        try {
            System.out.println(f.get() instanceof Apple);
            Orange c = (Orange) f.get();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
        System.out.println(f.equals(d));
    }
}
