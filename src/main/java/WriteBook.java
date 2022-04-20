public class WriteBook extends Thread{


    public void run(){

        int[] array = {1,2,3,4,5};
        for(int i=0;i<=array.length;i++){
            System.out.println("writing : "+array[i]);
        }
    }

}
