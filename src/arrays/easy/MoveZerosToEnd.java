package arrays.easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int [] arr={1,0,2,3,0,4,0,1};

        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void moveZerosToEnd(int[] arr) {

        int target=0;
        int toSwap=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) {
                target = i;
                toSwap=target+1;
                while(toSwap<arr.length){
                    if(arr[toSwap]!=0){
                        int temp=arr[toSwap];
                        arr[toSwap]=arr[target];
                        arr[target]=temp;
                        target++;
                        toSwap++;
                    }
                    else{
                        toSwap++;
                    }
                }
            }

        }

    }
}
