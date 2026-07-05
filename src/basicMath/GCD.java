package basicMath;

public class GCD {

    public static void main(String[] args) {
        findGcd(1,5);
    }

    private static void findGcd(int a, int b) {

        int start= Math.min(a, b);
        while(start>=1){
            if(a%start==0 && b%start==0){
                break;
            }
            start--;
        }
        System.out.println(start);
    }
}
