package sorting;

import java.util.Arrays;

public class SelectionSort {
        public static int[] sortArray(int[] nums) {

            int n=nums.length;
            int minIndex=-1;
            for (int i=0;i<n-1;i++){

                minIndex=i;
                for(int j=i+1;j<n;j++){
                    if(nums[minIndex]>nums[j]){
                        minIndex=j;
                    }
                }
                int temp=nums[minIndex];
                nums[minIndex]=nums[i];
                nums[i]=temp;

            }

            return nums;
        }

    public static void main(String[] args) {
        int []nums={5,3,6,1,2,7};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
    }
