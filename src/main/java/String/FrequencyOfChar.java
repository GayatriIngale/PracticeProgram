package String;

public class FrequencyOfChar {
//    public  static  void  main(String args[]){
//        String str = "picture perfect";
//        int[] freq = new int[str.length()];
//        int i,j,count;
//        char[] string = str.toCharArray();
//        for(i=0;i< string.length;i++){
//            count =1;
//            for(j=i+1;j< string.length;j++){
//                if(string[i]==string[j])
//                {
//                    count++;
//                    string[j]='0';
//                }
//            }
//           freq[i]= count;
//            if(string[i] != ' ' && string[i] != '0')
//                System.out.println(string[i]+" = "+freq[i]);
//            }
//        }

    public static void main(String args[]) {
        String str = "picture perfect";
        int[] freq = new int[str.length()];
        int i, j, count;
        char[] string = str.toCharArray();
     for(i=0;i< string.length;i++){
         count=1;
         for(j=i+1;j< string.length;j++){
             if(string[i]==string[j]){
                 count++;
                 string[j]='0';
             }
         }
         freq[i]=count;
         if(string[i]!='0' && string[i]!=' '){
             System.out.println(string[i]+" = "+freq[i]);
         }
     }
    }
}
