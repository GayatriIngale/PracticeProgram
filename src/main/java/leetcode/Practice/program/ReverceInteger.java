package leetcode.Practice.program;

public class ReverceInteger {

    public static int reverse(int x) {
        int temp,n=x,rem,sum=0;
        while(n!=0){
            rem = n%10;
            sum = (sum*10)+rem;
            n=n/10;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(ReverceInteger.reverse(123));
    }
}
