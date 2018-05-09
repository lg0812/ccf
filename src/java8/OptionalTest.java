package java8;

import stream.Dish;

import java.util.*;

public class OptionalTest {
    public static void main(String[] args) {
        Map<String, Dish> map1 = new HashMap<>();
        map1.put("index", new Dish(100, "nothing"));
        getInfo(map1);
    }

    /**
     * @param map <br>
     *            map
     *            flatMap
     *            ifPresent 如果值存在，就执行该值的方法调用，否则什么也不做
     *            isPresent 如果值存在，就返回true，否则返回false
     *            get 如果值存在，就执行使用该值的方法，否则抛出一个NoSuchElementException异常
     *            ofNullable 将指定值用Optional封装之后返回，如果该值为null，则返回一个空的Optional对象
     *            orElse 如果有值则返回，否则返回一个默认值
     *            orElseGet 如果有值则返回，否则返回一个由指定的Supplier借口生成的值
     *            orElseThrow 如果有值则返回，否则抛出一个由指定的Supplier借口生成的异常
     */
    private static void getInfo(Map<String, Dish> map) {
//        System.out.println(Optional.ofNullable(map.get("index1")).map(s -> s.getCalories()).get());
        System.out.println("---------->1");
        System.out.println(Optional.ofNullable(map.get("index1")).map(Dish::getName).orElse("none"));
        System.out.println("---------->2");
        System.out.println(Optional.ofNullable(map.get("index1")).map(Dish::getName).orElseThrow(NullPointerException::new));

    }
}
