package patternQuestions;



public class Pattern7 {
    public static void main(String[] args) {
        pattern7(4);
        System.out.println();
        pattern8(5);
        pattern9(4);
    }

    private static void pattern8(int n) {
        /*
        *********
         *******
          *****
           ***
            *
         */

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(n-i)*2-1;k++){
                System.out.print("*");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    private static void pattern7(int n) {
        /*
         *
        ***
       *****
      *******
     *********
         */

        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
//        *
//       ***
//      *****
//     *******
//    *********
//    *********
//     *******
//      *****
//       ***
//        *
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(n-i)*2-1;k++){
                System.out.print("*");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }

    }

}
