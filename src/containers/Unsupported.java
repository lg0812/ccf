package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by LG0812 on 2018/4/27.
 */
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("----" + msg);
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 3);
        Collection<String> c2 = new ArrayList<String>(subList);

        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("retainAll:" + e);
        }

        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll:" + e);
        }

        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear:" + e);
        }

        try {
            list.set(0, "X");
        } catch (Exception e) {
            System.out.println("clear:" + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H".split(" "));

        test("ArrayList", new ArrayList<String>(list));
        test("Arrays.asList()", list);
    }
}
