public class solution {
	public static boolean isStringPalindrome(String input) {
        int i=0,j=input.length()-1;
        return palindromecheck(input,i,j);
	}
    public static boolean palindromecheck(String str,int i,int j){
        if(i>=j){
            return true;
        }else
        if(str.charAt(i)==str.charAt(j)){
            return palindromecheck(str,i+1,j-1);
        }else
            return false;
    }
}
