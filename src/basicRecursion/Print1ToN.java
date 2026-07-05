package basicRecursion;

public class Print1ToN {
    public static void main(String[] args) {
        print1ToN(1,4);
    }

    private static void print1ToN(int count,int n) {

        if(count>n){
            return;
        }
        print1ToN(count+1,n);
        System.out.println(count);

    }
}
