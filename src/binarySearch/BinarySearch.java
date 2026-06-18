package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,11,13,17,19,23,29,31};
        int target=45;
        System.out.println(binarySearchUsingRecursion(arr,target,0,arr.length-1)?"present":"absent");
        System.out.println(binarySearch(arr,target));

    }

    private static String binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while(start<=end) {
            int mid = (start + end) / 2;
            if(arr[mid]==target){
                return "present";
            }else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return "not present";
    }

    private static boolean binarySearchUsingRecursion(int[] arr, int target, int start, int end) {
        if(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(target>arr[mid]){
                return binarySearchUsingRecursion(arr, target, mid+1,  end);
            }else{
                return binarySearchUsingRecursion(arr, target, start,  mid-1);
            }
        }
        return false;
    }
}
