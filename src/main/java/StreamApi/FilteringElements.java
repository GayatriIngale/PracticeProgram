package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilteringElements {

    public static void main(String[] args) {
       List<Product> productList = new ArrayList<>();
       productList.add(new Product(1,"HP Lapi",1000f));
        productList.add(new Product(2,"soap",56.98f));
        productList.add(new Product(3,"mobile",5967f));
        productList.add(new Product(4,"noteBook",789f));
        productList.add(new Product(5,"pen",3000f));

      Float totalPrice = productList.stream()
              .map(product -> product.price)
//              .reduce(0.0f,(sum,price)-> sum+price);
              .reduce(0.0f,Float::sum);
        System.out.println("this is reduce :"+totalPrice);
//        double totalPrice2 = productList.stream()
//                .collect(Collectors.summingDouble(product -> product.price));
//        System.out.println(totalPrice2);
//
//        Product productMax = productList.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
//        System.out.println(productMax.price);
//        Product productMin = productList.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
//        System.out.println(productMin.price);
//
//
//        long count = productList.stream()
//                .filter(p->p.price <3000)
//                .count();
//        System.out.println("total count: "+count);

        List<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(15);
        marks.add(20);
        List<Integer> list = marks.stream().map(m -> m+5).collect(Collectors.toList());
        System.out.println(list);



//        List<Float> productList2 = productList.stream()
//                .filter(p -> p.price>=3000)
//                .map(p -> p.price)
//                .collect(Collectors.toList());
//        System.out.println(productList2);
//
//        productList.stream().filter(p -> p.price==3000).forEach(product -> System.out.println(product.name));
//


    }
}
