package StaticDefaultMethode;

public class MyStudent {

    public static void main(String[] args) {
        Student s = () -> System.out.println("This is abstract");

        s.say();
        s.show();
        Student.print();


    }


}
