package String;

public class SubString {
    public static void  main(String args[]){
        String s = "aaabbbccc";
        int len = s.length(),n=3;
        int tem =0, rem = len/n;
        String[] equalStr= new  String[n];
        if(len % n !=0){
            System.out.println("Sorry String can't be divided");
        }
        else{
            for(int i =0;i<len;i= i+n){
                equalStr[tem] = s.substring(i,i+n);
                tem++;
            }
            for (int i=0;i<equalStr.length;i++){
                System.out.println(equalStr[i]);
            }
        }
    }

}
