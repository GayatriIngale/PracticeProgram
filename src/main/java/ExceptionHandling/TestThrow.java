package ExceptionHandling;

public class TestThrow {
    public static void m(int age) throws UserDefinedException  {
           if(age<18)
               throw  new UserDefinedException("user can't vote");
           else
               System.out.println("Age is  :"+age);
    }


    public static void main(String[] args) throws UserDefinedException {

           m(19);
    }
}
