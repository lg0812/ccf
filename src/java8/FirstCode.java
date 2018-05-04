package java8;


import generics.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class FirstCode {
    public static void main(String[] args) {
        new FirstCode().firstCode();
//        new FirstCode().lambdaAppleWeight();
    }


    public void firstCode() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("java8 lambda");
        list.add("code");

        list.sort(Comparator.comparing(s -> s.length()));

        new Thread(() -> System.out.println("nothing")).start();

        System.out.println(list.toString());
    }

    public void lambdaAppleWeight() {
        List<Apple> list = Arrays.asList(
                new Apple(1, "green"),
                new Apple(2, "red"),
                new Apple(3, "yellow"));

//        System.out.println(filterByWeight(list, new WeightApplePredicate()));
        System.out.println(filterByWeight(list, (Apple a) -> a.weight >= 2));

    }

    public List<Apple> filterByWeight(List<Apple> list, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : list)
            if (p.test(a)) {
                result.add(a);
            }

        return result;
    }

    public class WeightApplePredicate implements ApplePredicate {


        @Override
        public boolean test(Apple apple) {
            return apple.weight > 2;
        }
    }

    public class ColorApplePredicate implements ApplePredicate {


        @Override
        public boolean test(Apple apple) {
            return "green".equals(apple.color);
        }
    }
}
