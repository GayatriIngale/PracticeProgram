package Java8Featurs;

public class MethodReference {
//
//    public  void saySomething() {
//        System.out.println("here is gayatri");
//    }
//
//    public static void main(String[] args) {
//        MethodReference methodReference = new MethodReference();
//        Sayable sayable = methodReference::saySomething;
//        sayable.say();
//
//
//        Thread t1 = new Thread(MethodReference::threadStatus);
//        t1.start();
//    }
//
//    public static void threadStatus() {
//        System.out.println("thread is runing");
//    }

    void saySomething() {
        System.out.println("Gayatri here");
    }

    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();
        Sayable sayable = methodReference::saySomething;
        sayable.say();

    }


}
