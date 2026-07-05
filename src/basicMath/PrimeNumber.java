package basicMath;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Given number is prime= "+ checkPrime(2));
    }

    private static String checkPrime(int n) {
        int count=0;

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }

        }
        if(count==2){
            return "true";
        }else{
            return "false";
        }
    }
}
