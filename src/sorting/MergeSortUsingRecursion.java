package sorting;

import java.util.Arrays;

public class MergeSortUsingRecursion {

    public static void main(String[] args) {
        int []arr={6,7,1,2,4,3,9,8,5,0};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int [] arr) {
        int l=arr.length;
        if(l==1){
            return arr;
        }
        int mid=l/2;
        int []left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int []right=mergeSort(Arrays.copyOfRange(arr,mid,l));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {

        int ans[]=new int[left.length+ right.length];
        int i=0,j=0,k=0;
        while(i<left.length&& j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            ans[k]=right[j];
            k++;
            j++;
        }
        return ans;

    }
}
