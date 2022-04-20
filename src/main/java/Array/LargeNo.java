package Array;

public class LargeNo {
    public static void main(String args[]){
        int[] a = {20,30,89,22,49};
        int large=a[0];
        for(int i=1;i<a.length;i++){
            if(large<a[i])
                large=a[i];
        }
        System.out.println(large);
    }
}
