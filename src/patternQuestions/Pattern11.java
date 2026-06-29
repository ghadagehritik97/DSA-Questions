package patternQuestions;

public class Pattern11 {
    public static void main(String[] args) {
//        pattern11(5);
        pattern12(4);
    }

    private static void pattern12(int n) {
//        1        1
//        12      21
//        123    321
//        1234  4321
//        1234554321

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            int spaces=(n*2)-(i*2);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for (int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    private static void pattern11(int n) {
        for(int i=1;i<=5;i++){
            int value;
            if(i%2==0){
                value=0;
            }else{
                value=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(value+" ");
                value=value==0?1:0;
            }
            System.out.println();


        }

    }
}
