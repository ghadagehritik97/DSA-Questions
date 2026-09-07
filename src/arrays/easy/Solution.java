package arrays.easy;

class Solution {
    public static void main(String[] args) {
        int[]arr={2,1,3,4};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {
        if(nums.length==0){
            return false;
        }
        int drops=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                drops+=1;
            }
        }
        if(drops>1){
            return false;
        }
        return true;
    }
}
