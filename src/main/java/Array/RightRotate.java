package Array;

public class RightRotate {
    public static  void  main(String args[]){
        int a[] = {1,2,3,4,5};
        int r = 2,i;

        for(int j=1;j<=r;j++){
            int temp = a[a.length-1];
            for( i=a.length-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=temp;
        }
       for(int k=0;k<a.length;k++){
           System.out.print(a[k]+" ");
       }
    }
}
