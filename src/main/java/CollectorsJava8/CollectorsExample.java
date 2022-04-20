package CollectorsJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Product1> list = new ArrayList<>();
        list.add(new Product1(1,"soap",24f));
        list.add(new Product1(2,"mobile",25000f));
        list.add(new Product1(3,"Laptop", 98000f));
        list.add(new Product1(7,"spect",1200f));
        list.add(new Product1(6,"watch",2000f));
//        Set<Float> productPriceList =  list.stream().filter(x -> x.price>3000f).map(x -> x.price).collect(Collectors.toSet());
//        System.out.println(productPriceList);
//
//        Double sumPrice = list.stream().collect(Collectors.summingDouble(x -> x.price));
//        System.out.println(sumPrice);
//
//        Integer id = list.stream().collect(Collectors.summingInt(x -> x.id));
//        System.out.println(id);
//
//        Double average = list.stream().collect(Collectors.averagingDouble(x -> x.price));
//        System.out.println("Average : "+average);
//
//        Long count = list.stream().collect(Collectors.counting());
//        System.out.println("Total count : "+count);

        //fetching data as List
        List<Product1> list1 =list.stream().collect(Collectors.toList());
        System.out.println(list1);


        //converting data as string
        Set<Float> price = list.stream()
                .map(x -> x.price).collect(Collectors.toSet());
        System.out.println(price);

        //Using sum Methode
        Double sumOfPrice = list.stream().collect(Collectors.summingDouble(x -> x.price));
        System.out.println("This is Sum of Price: "+sumOfPrice);

        //Getting average
        Double average = list.stream().collect(Collectors.averagingDouble(x -> x.price));
        System.out.println("Average of price: "+average);

        //counting element
        Long count = list.stream().collect(Collectors.counting());
        System.out.println("Total count: "+count);
    }
}
