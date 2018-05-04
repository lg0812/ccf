package java8;

import generics.Apple;


/**
 * 不管有多少默认方法，只要接口只定义了一个抽象
 * 方法，它就仍然是一个函数式接口。
 */
@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}
