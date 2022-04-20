package String;

public class Permutations {

    public static String swapString(String start, int i, int j) {
        char[] ch = start.toCharArray();
        char c = ch[i];
        ch[i] = ch[j];
        ch[j] = c;
        return String.valueOf(ch);
    }

    public static void main(String args[]) {

        String str = "ABC";
        int len = str.length();
        generatePermutation(str,0,len);
    }

    public static void generatePermutation(String str, int start, int end) {
        if(start==end-1)
            System.out.println(str);
        else{
            for(int i=start;i<end;i++){
                str =swapString(str,start,i);
                generatePermutation(str,start+1,end);
//                str =swapString(str,start+1,i);
            }
        }
    }
}
