package basicMath;

public class DivisorsOfNum {
    public static void main(String[] args) {
        printDivisors(31);
    }

    private static void printDivisors(int n) {
        int counter=n/2;
        for(int i=1;i<=counter;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.print(n);
    }
}
