package leetcode.Practice.program;

public class RemoveDuplicates {
    public  static  int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    nums[i]='_';
                }
            }
        }

          return  nums;
    }

    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums ={1,1,2};
        int[] ans = removeDuplicates(nums);
        int count = 0;
        for (int i=0;i< nums.length;i++){
            if(ans[i]!=95){
                count++;
                System.out.print(ans[i]+" ");
            }

        }
        System.out.println();
        System.out.println(count);
    }
}
