package Datastructures;

import java.util.Set;

public interface MyISyncTable {
    int add(Object obj);

    void remove(Integer key);

    Object get(Integer key);

    void update(Integer key, Object obj);

    boolean search(Integer key);

    int size();

    boolean isEmpty();

    Set<Integer> keys();
}
