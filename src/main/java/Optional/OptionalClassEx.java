package Optional;

import java.util.Optional;

public class OptionalClassEx {

    public static void main(String[] args) {
        String str[] = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
        Optional<String> empty = Optional.empty();
       System.out.println(empty);
        Optional<String> value = Optional.of(str[5]);
      //  System.out.println("Filtred value: "+value.filter(x -> x.equals("abc")));
        value.ifPresent(System.out::println);
        System.out.println(value.orElse("orElse: " +"value is not present"));
        System.out.println(empty.orElse("orElse: " +"value is not present"));


    }
}
