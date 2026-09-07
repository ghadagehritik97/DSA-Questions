package arrays.easy;

public class SecondLargestEle {

    public static void main(String[] args) {
        int arr[]={6,8,9,5,3,2,5,1};
        secondLargestEle(arr);
    }

    private static void secondLargestEle(int[] arr) {

        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        if(arr.length<2){
            System.out.println("No second large element present");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                secondLarge=large;
                large=arr[i];
            }else if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge=arr[i];
            }
        }
        System.out.println(secondLarge);

    }
}
