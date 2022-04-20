package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IteratingStream {
    public static void main(String[] args) {
        Stream.iterate(1,element -> element+1)
                .filter(element -> element%5==0)
                .limit(5)
                .forEach(System.out::println);
    }
}
