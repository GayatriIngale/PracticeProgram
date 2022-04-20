public class Fibonacci {



    public static void main(String args[]) {

        String s = "nitim";
        String s1 ="";
        for(int i=s.length()-1; i>=0;i--){
            char c = s.charAt(i);
             s1 = s1.concat(String.valueOf(c));
        }
        if(s1.equals(s))
            System.out.println("String is pallendrom");

        else
            System.out.println("Not pallendrom");
    }


}
