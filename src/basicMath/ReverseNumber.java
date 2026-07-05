package basicMath;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(-12345);

    }

    private static void reverseNumber(int n) {
        int reversedNum=0;
        while(n>0){
            int digit=n%10;
            reversedNum=reversedNum*10+digit;
            n/=10;
        }
        System.out.println(reversedNum);
    }
}
