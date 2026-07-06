package basicRecursion;

public class PalindromeString {
    public static void main(String[] args) {
        String pal=" ";
        String formattedString=formatString(pal.toLowerCase());
        System.out.println(checkPalindrome(0,formattedString.length()-1,formattedString));
    }

    private static String formatString(String pal) {
        StringBuilder result= new StringBuilder();
        for(int i=0;i<pal.length();i++){
            if((pal.charAt(i)<=122 && pal.charAt(i)>=97)|| (pal.charAt(i)>='0'&& pal.charAt(i)<='9')){
                result.append(pal.charAt(i));
            }
        }
        return result.toString();
    }

    private static boolean checkPalindrome(int start,int end,String pal) {
        if(start>=end){
            return true;
        }
        if(pal.charAt(start)!=pal.charAt(end)){
            return false;
        }
        return checkPalindrome(start+1,end-1,pal);
    }
}
