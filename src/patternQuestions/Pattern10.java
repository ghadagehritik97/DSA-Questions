package patternQuestions;

public class Pattern10 {
    public static void main(String[] args) {
        pattern10(3);
    }

    private static void pattern10(int n) {
//        *
//        **
//        ***
//        **
//        *
        for(int i=1;i<=n*2-1;i++){
            int stars=i;
            if(stars>n){
                stars=n*2-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
