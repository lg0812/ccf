package enums;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore {
	HERE, THRER
}

public class Reflection {
	public static Set<String> analyze(Class<?> enumClass) {

		System.out.println("------  analyzing" + enumClass + "------");
		System.out.println("interfaces:");
		for (Type t : enumClass.getGenericInterfaces()) {
			System.out.println(t);
		}
		System.out.println("Base:" + enumClass.getSuperclass());
		System.out.println("method:");
		Set<String> methods = new TreeSet<>();
		for (Method m : enumClass.getMethods()) {
			methods.add(m.getName());
		}
		return methods;
	}

	public static void main(String[] args) {
		Set<String> explore = analyze(Explore.class);
		Set<String> enumMethods = analyze(Enum.class);

		System.out.println(explore.containsAll(enumMethods));
		explore.removeAll(enumMethods);
		System.out.println(enumMethods);

		System.out.println(Explore.values());
	}

	@Override
	public String toString() {
		return "Reflection [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
