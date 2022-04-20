package CollectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("gayu");
        list.add("jayu");
        list.add("gayu");

        Set<String> set = new HashSet(list);
        set.add("snehu");
        set.add("jagu");
        System.out.println(set);
    }
}
