package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[]={5,6,4,3,1,2,3};
        System.out.println(Arrays.toString(insertionSort(arr)));



    }

    private static int[] insertionSort(int[] arr) {
        int size=arr.length;

        for(int i=0;i<size-1;i++){
            int j=i+1;
            while(j>=1){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                j--;
            }
        }
        return arr;

    }
}
