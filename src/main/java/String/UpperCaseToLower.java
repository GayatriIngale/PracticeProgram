package String;

public class UpperCaseToLower {
    public static  void  main(String args[]){
        String s = "Great Power";
        StringBuffer newStr = new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                newStr.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            }
            else if(Character.isUpperCase(s.charAt(i))){
                newStr.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(newStr);
    }
}
