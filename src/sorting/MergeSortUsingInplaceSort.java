package sorting;

import java.util.Arrays;

public class MergeSortUsingInplaceSort {
    public static void main(String[] args) {
        int []arr={9,8,7,6,5,4,3,2,1,3,0};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int s,int e) {

        if(e-s==1){
            return;
        }
        int m=s+(e-s)/2;

        mergeSort(arr,s,m);
        mergeSort(arr,m,e);
        mergeInplace(arr,s,m,e);
    }

    private static void mergeInplace(int[] arr, int s, int m, int e) {
        int []mix=new int [e-s];
        int i=s;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            k++;
            i++;
        }
        while(j<e){
            mix[k]=arr[j];
            k++;
            i++;
        }

        for(int l=0;l< mix.length;l++){
            arr[s+i]=arr[i];
        }
    }
}
