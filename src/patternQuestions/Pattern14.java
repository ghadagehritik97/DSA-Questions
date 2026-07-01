package patternQuestions;

public class Pattern14 {
    public static void main(String[] args) {
//        pattern14(5);
        pattern15(5);
    }

    private static void pattern14(int n) {

//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
        //Upper half
        for(int i=0;i<n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("*");
            }
            for(int k=1;k<=i*2;k++){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(n*2)-(i*2);k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern15(int n){
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

        int copy1=n-1;
        int copy2=n-1;
        for(int i=1;i<=n*2-1;i++){
            for (int j=1;j<=i&&i<=n;j++){
                System.out.print("*");
            }
            if(i>n){

                for(int j=copy1;j>=1;j--){
                    System.out.print("*");
                }
                copy1--;
            }

            //logic for spaces
            for(int k=1;k<=(Math.abs((n*2)-(i*2)));k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i&&i<=n;j++){
                System.out.print("*");
            }
            if(i>n){

                for(int j=copy2;j>=1;j--){
                    System.out.print("*");
                }
                copy2--;
            }
            System.out.println();
        }
    }
}
