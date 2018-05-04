package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishStream {
    public static void main(String[] args) {
        new DishStream().test1();
    }

    /**
     * 中间操作：
     * filter
     * map
     * limit
     * sorted
     * distinct
     * <p>
     * 终端操作
     * forEach
     * count
     * collect
     */

    public void test1() {
        List<Dish> list = Arrays.asList(new Dish(100, "tomcat"),
                new Dish(200, "jetty"),
                new Dish(300, "apache"));

        List<String> l = list.stream().filter((Dish d) -> d.calories >= 200)
                .sorted(Comparator.comparing((Dish d) -> d.name))
                .map((Dish d) -> d.name)
                .collect(Collectors.toList());
        System.out.println(l.toString());
    }
}
