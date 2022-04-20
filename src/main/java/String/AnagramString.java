package String;

import java.util.Arrays;

public class AnagramString {
    public static  void  main(String args[]){
        String s1="gaytri";
        String s2 = "yagrit";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length() == s2.length()){
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2))
                System.out.println(" Anagram String");
            else
                System.out.println("Not Anagram String");
        }
        else
            System.out.println("Not Anagram String");
    }


}
