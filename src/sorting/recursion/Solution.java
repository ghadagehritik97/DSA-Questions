package sorting.recursion;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[]arr={7,4,5,3,1,2};
//        int []sortedArr=mergeSort(arr);
//        bubbleSortRecurse(arr,arr.length-1,0);
//        insertionSortRecurse(arr,1, 1);
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int low,int hi) {

        if(low>hi){
            return;
        }
        int s=low;
        int e=hi;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,hi);
    }

    private static void insertionSortRecurse(int[] arr,int row,int col) {
        if(row>arr.length-1){
            return;
        }
        if(col<=row && col>0){
            if(arr[col]<=arr[col-1]){
                int temp=arr[col];
                arr[col]=arr[col-1];
                arr[col-1]=temp;
            }
            insertionSortRecurse(arr,row,col-1);
        }else{
            insertionSortRecurse(arr,row+1,row+1);
        }

    }

    public static void bubbleSortRecurse(int []arr,int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubbleSortRecurse(arr,row,col+1);
        }
        else{
            bubbleSortRecurse(arr,row-1,0);
        }

    }


    private static int [] mergeSort(int[] arr) {

        if(arr.length<2){
            return arr;
        }
        int mid=arr.length/2;
        int [] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[]=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeHalves(left,right);

    }

    private static int[] mergeHalves(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;
        int []ans=new int[left.length+right.length];
        while(i<left.length&& j<right.length){
            if(left[i]<=right[j]){
                ans[k]=left[i];
                i++;
                k++;
            }else{
                ans[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
}