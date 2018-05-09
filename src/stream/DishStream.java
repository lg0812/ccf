package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishStream {
    public static void main(String[] args) {
//        new DishStream().test1();
        new DishStream().test2();
    }

    /**
     * 中间操作：
     * filter : 数据筛选
     * map：对流中的每一个元素应用函数
     * limit ： 返回一定长度的流
     * skip : 扔掉前n个元素
     * sorted：
     * flatMap : 流的扁平化
     * distinct ： 确保没有重复的元素
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


    public void test2() {
        List<Dish> list = Arrays.asList(new Dish(100, "tomcat"),
                new Dish(200, "jetty"),
                new Dish(300, "apache"));

        List<String> l = list.stream().filter((Dish d) -> d.calories >= 200)
                .sorted(Comparator.comparing((Dish d) -> d.name))
                .map((Dish d) -> d.name.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(l.toString());
    }
}
