package containers;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Created by LG0812 on 2018/4/27.
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    static final int SIZE = 997;
    LinkedList<Entry<K, V>>[] buckedts = new LinkedList[SIZE];

    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;

        if (buckedts[index] == null) {

        }
        return oldValue;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
