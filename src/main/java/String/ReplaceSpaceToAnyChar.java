package String;

public class ReplaceSpaceToAnyChar {
    public static void main(String args[]){
        String str ="Once in a blue moon";
       char ch ='-';
       str = str.replace(' ',ch);
       System.out.println(str);

    }
}
