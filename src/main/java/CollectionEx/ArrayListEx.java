package CollectionEx;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(89);
        List<Object> list1 = new ArrayList<>();
        list1.add("gayatri");
        list1.add('g');
        list1.add(12.98);
        list.removeIf(x -> x==3);
        list1.addAll(list);
        Iterator itr = list1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
