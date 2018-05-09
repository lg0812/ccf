package java8;


import stream.Dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Chapter6 {
    public static void main(String[] args) {
        new Chapter6().test1();
    }

    private void test1() {
        List<Dish> list = Arrays.asList(
                new Dish(1, "green"),
                new Dish(2, "red"),
                new Dish(3, "yellow"));
        Optional<Dish> dish = list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)));
    }
}
