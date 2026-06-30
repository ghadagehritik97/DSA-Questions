package patternQuestions;

public class Pattern12 {

    public static void main(String[] args) {
//        pattern12(4);
        pattern13(5);
    }

    private static void pattern13(int n) {
//        E
//        D E
//        C D E
//        B C D E
//        A B C D E

        for (int i=0;i<n;i++){
            char ch= (char)(65+n-1-i);
            for (int j=0;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    private static void pattern12(int n) {
       for(int i=0;i<n;i++){

           for(int j=1;j<=n-i-1;j++){
               System.out.print(" ");
           }
           char ch='A';
           for(int k=0;k<i*2+1;k++){
               System.out.print(ch);
               if(k<i){
                  ch++;
               }else{
                   ch--;
               }
           }
           for(int j=1;j<=n-i-1;j++){
               System.out.print(" ");
           }
           System.out.println();
       }

    }
}
