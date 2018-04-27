package containers;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by LG0812 on 2018/4/27.
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<String>();

        Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();

        Iterator<String> it = sortedSet.iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) low = it.next();
            if (i == 6) high = it.next();

            else it.next();
        }

        System.out.println(sortedSet.headSet(high));
        System.out.println(sortedSet.tailSet(low));
    }
}
