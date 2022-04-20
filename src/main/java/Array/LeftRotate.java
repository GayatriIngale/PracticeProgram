package Array;

public class LeftRotate {

    public  static void  main(String args[]){
        int[] a = {1,2,3,4,5};
         int r = 2, temp,j;

         for(int i=0;i<r;i++){
             temp= a[0];
             for( j=0;j<a.length-1;j++){
                 a[j]=a[j+1];

             }
             a[j]=temp;
         }
         for (int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
         }
    }
    
}
