package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={6,8,4,1,3,5,9,2,7,0};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {
        int size= arr.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;

    }

}
