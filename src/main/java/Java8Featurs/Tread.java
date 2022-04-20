package Java8Featurs;

public class Tread {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is r1 thread.");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = ()->{
            System.out.println("This is r2 thread");
        };
        Thread t2 = new Thread(r2);
        t2.start();
        }

}
