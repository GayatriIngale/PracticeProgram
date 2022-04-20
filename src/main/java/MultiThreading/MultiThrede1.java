package MultiThreading;

public class MultiThrede1 extends Thread {
    Table t;
    public MultiThrede1(Table obj) {
        this.t= obj;
    }

    @Override
    public void run() {
       t.printTable(5);
    }
}
