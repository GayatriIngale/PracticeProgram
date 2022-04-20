
public class Multithreadibg {

    public static void main(String args[]) throws InterruptedException {
         Thread t1 = new ReadBook();
         Thread t2 = new WriteBook();
         t1.start();
         t2.start();
    }


}
