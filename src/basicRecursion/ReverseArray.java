package basicRecursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        int [] reversedArr=new int[arr.length];
        reverseArray(arr.length-1,0,arr,reversedArr);
        System.out.println(Arrays.toString(reversedArr));
    }

    private static void reverseArray(int n,int counter,int[] arr, int[] reversedArr) {
        if(n<0){
            return;
        }
        reversedArr[counter]=arr[n];
        reverseArray(n-1,counter+1,arr,reversedArr);

    }
}
