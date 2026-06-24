package patternQuestions;

public class Pattern4 {

    public static void main(String[] args) {
        pattern5(5);
        pattern6(5);
    }

    private static void pattern6(int ni) {
        /*
        12345
        1234
        123
        12
        1
        */
        for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        /*

         *****
         ****
         ***
         **
         *

        */

        for (int i=5;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
