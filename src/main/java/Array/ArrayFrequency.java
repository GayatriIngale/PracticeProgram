package Array;

public class ArrayFrequency {

    public static void  main(String args[]){
        int[] a = {1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int n = a.length;
        int frq[] = new int[n];
        int visited = -1 ;
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    frq[j]=visited;
                }
            }
            if(frq[i] != visited){
                frq[i]=count;
            }
        }

        System.out.println(" Element | Frequency");
        for(int i=0;i<n;i++){
            if(frq[i] != visited){
                System.out.println(" "+a[i]+ "               "+frq[i]);            }

        }
    }
   }
