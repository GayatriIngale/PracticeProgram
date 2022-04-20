package String;

public class PalindromString {
        public static  void  main(String args[]){
        String s = "Nitin";
        boolean flag = true;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                flag= false;
                break;
            }
        }
        if (flag)
            System.out.println("Palindrom");
        else
            System.out.println("Not Palindrom");

    }

}
