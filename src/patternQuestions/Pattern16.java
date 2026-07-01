package patternQuestions;

public class Pattern16 {
    public static void main(String[] args) {
        pattern16(5);
    }

    private static void pattern16(int n) {
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
