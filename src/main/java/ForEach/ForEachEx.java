package ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
       list.forEach(a -> System.out.println(a));
      // list.forEach(System.out::println);
        //list.stream().map(a -> a*2).forEach(System.out::println);
        System.out.println("By Methode reference");
        list.stream().forEachOrdered(System.out::println);
        System.out.println("By Lammbda Expression ");
        list.stream().forEachOrdered(a -> System.out.println(a));
    }
}
