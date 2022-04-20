package MultiThreading;

public class MultiThreade2 extends  Thread{
     Table t;
    public MultiThreade2(Table obj) {
        this.t=obj;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}
