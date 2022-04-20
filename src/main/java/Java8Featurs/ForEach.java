package Java8Featurs;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("gayatri");
//        list.add("Prabhu");
//        list.add("Ingale");
//        list.forEach(
//                (n)->{
//                    System.out.println(n);
//                }
//        );

        Addition ad1 = (msg)->{
            String s1 = "my name is ,";
            String s2 = s1+msg;
            return  msg;
        };
        System.out.println(ad1.massege("Ingale Gaytri."));

    }
}
