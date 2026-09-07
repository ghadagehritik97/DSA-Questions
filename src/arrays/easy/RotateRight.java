package arrays.easy;

import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
        int []nums={-1,-100};
        rotate(nums,1);
        System.out.println(Arrays.toString(nums));
    }
        public static void rotate(int[] nums, int k) {
            int n=nums.length;

            for(int i=1;i<=k;i++){
                int next=nums[0];
                for(int j=1;j<=n;j++){
                    if(j==n){
                        nums[0]=next;
                    }else{
                        int temp=next;
                        next=nums[j];
                        nums[j]=temp;
                    }
                }
            }

        }
}
