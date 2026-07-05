package basicRecursion;

public class SumTillN {
    public static void main(String[] args) {
        System.out.println(sumTillN(5));
    }

    private static int sumTillN(int n) {
        if(n==1){
            return 1;
        }
        return n+sumTillN(n-1);
    }

}
