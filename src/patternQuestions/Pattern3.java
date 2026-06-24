package patternQuestions;

public class Pattern3 {
    /*
        1
        12
        123
        1234
        12345
    */
    public static void main(String[] args) {
        pattern3(5);
        System.out.println();
        pattern4(5);
    }

    private static void pattern4(int n) {
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
