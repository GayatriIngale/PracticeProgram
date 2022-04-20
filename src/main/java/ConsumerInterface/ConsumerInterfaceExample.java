package ConsumerInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {

    public static void  myName(String name){
        System.out.println("Hello "+name);
    }
    public static  void rollNumber(int roll){
        System.out.println("Roll No. "+ roll);
    }
    public static void main(String[] args) {
        Consumer<String> consumer =ConsumerInterfaceExample::myName;
        consumer.accept("Gayatri");
        Consumer<Integer> consumer1 = ConsumerInterfaceExample::rollNumber;
        consumer1.accept(12);
    }
}
