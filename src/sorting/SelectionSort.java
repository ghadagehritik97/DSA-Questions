package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//        System.out.println("Selection Sort using minimum element:");
//        System.out.println(Arrays.toString(sortArray(nums)));
//        System.out.println("Selection Sort using maximum element:");
//        System.out.println(Arrays.toString(sortWithMaxElement(nums)));

        System.out.println("Selection sort using streams");
        List<Integer>ans=Arrays.stream(nums).boxed().sorted().toList();

    }

    private static int[] sortWithMaxElement(int[] nums) {

            int size=nums.length;

            for(int i=size-1;i>=0;i--){
                int maxIndex=i;
                for(int j=0;j<=i;j++){
                    if(nums[maxIndex]<nums[j]){
                        maxIndex=j;
                    }

                }
                int temp=nums[maxIndex];
                nums[maxIndex]=nums[i];
                nums[i]=temp;
            }
            return nums;
    }
}
