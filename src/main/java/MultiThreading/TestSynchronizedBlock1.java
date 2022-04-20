package MultiThreading;

public class TestSynchronizedBlock1 {
    public static void main(String[] args) {
        Table obj = new Table();
        MultiThrede1 threde1 = new MultiThrede1(obj);
        MultiThreade2 threade2 = new MultiThreade2(obj);
        threade2.start();
        threde1.start();

    }

}
