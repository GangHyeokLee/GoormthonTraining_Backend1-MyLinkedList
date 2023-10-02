package GoormProject7_Linked_List;

import java.util.*;
import java.util.function.Consumer;

public class MyLinkedList <T> extends LinkedList implements Iterable {

    public MyLinkedList(){};

    public MyLinkedList(Collection<? extends T> c){
        addAll(c);
    }

    @Override
    public boolean add(Object element) {

        super.add(element);
        return true;
    }

    @Override
    public Object get(int index) {
        return super.get(index);
    }

    @Override
    public void forEach(Consumer action) {
        super.forEach(action);
    }


    public Object delete(int index){
        return remove(index);

    }
}
