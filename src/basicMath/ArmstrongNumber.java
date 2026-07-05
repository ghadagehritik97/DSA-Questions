package basicMath;

public class ArmstrongNumber {
    public static void main(String[] args) {
        isArmstrong(9474);
    }

    private static void isArmstrong(int n) {
        int pow= String.valueOf(n).length();
        int copy=n;
        int armstrong=0;
        while (n!=0){
            armstrong+=(int)Math.pow(n%10,pow);
            n/=10;
        }
        if(armstrong==copy){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
