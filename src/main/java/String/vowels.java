package String;

import java.util.Locale;

public class vowels {

    public static  void  main(String args[]){
        String str = "My Name Is gayatri oyu";
        str = str.toLowerCase();
        System.out.println(str);
        int vCount=0, cCount=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                vCount++;
            else
                cCount++;
        }
        System.out.println("Total vowels: "+vCount);
        System.out.println("Total Constants: "+cCount);

    }
}
