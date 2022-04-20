package PredicateInterface;

import java.util.function.Predicate;

public class PredicateIntefaceEx {

    static Boolean checkAge(int age){
        if(age>17)
            return  true;
        else
            return  false;
    }
    public static void main(String[] args) {
//        Predicate<Integer> pr = a -> (a>18);
//        System.out.println(pr.test(10));

        Predicate<Integer> pr = PredicateIntefaceEx::checkAge;
        Boolean result = pr.test(90);
        System.out.println(result);
    }


}
