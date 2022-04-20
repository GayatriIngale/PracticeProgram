package FunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample {
    static Integer addList(List<Integer> list){

        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        Function<List<Integer>, Integer> fun= FunctionInterfaceExample::addList;
       int result= fun.apply(list);
        System.out.println("Sum of all values: "+result);




    }
    }
