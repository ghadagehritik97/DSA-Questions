package basicRecursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        printName(3);
    }

    private static void printName(int n) {
        if(n==0){
            return ;
        }
        System.out.println("Hritik");
        printName(n-1);
    }
}
