package MultiThreading;

public class Table {
//
//    public void printValue(int n){
//        synchronized (this){
//         for(int i=1;i<=5;i++){
//             System.out.println(n*i);
//             try{
//                 Thread.sleep(400);
//             }catch(Exception e){System.out.println(e);}
//         }
//        }
//    }

    synchronized static void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
    }

    void  myName(){
        System.out.println("gayatri");
    }
}