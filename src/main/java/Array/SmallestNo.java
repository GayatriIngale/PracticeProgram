package Array;

public class SmallestNo {
    public static void main(String args[]){
        int[] a = {12,20,4,59,03};
        int small = a[0];
        for(int i=1;i<a.length;i++){
            if(small>a[i])
                small=a[i];
        }
        System.out.println(small);
    }
}
