package basicRecursion;

public class NthFiboNum {
    public static void main(String[] args) {
        System.out.println(nThFiboNum(3));
    }

    private static int nThFiboNum(int n) {
        if(n<=1){
            return n;
        }
        return nThFiboNum(n-1)+nThFiboNum(n-2);
    }
}
