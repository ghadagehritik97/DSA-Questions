package basicMath;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        countDigits(12345);
        countUsingLog(1);
    }

    private static void countUsingLog(int n) {
        int count=(int)(Math.log10(n)+1);
        System.out.println(count);
    }

    //12345
    private static void countDigits(int n) {
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
