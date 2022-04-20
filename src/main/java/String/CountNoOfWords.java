package String;

public class CountNoOfWords {
    public static void main(String[] args) {
        String string = "Big black bug bit a big  black dog on his big black nose";
        String[] words = string.split(" ");
       int count= 0;
       for(int i=0;i<string.length();i++){
           if(string.charAt(i)==' ')
           {
               count++;
           }
       }
        System.out.println(count);
    }
}
