
public class Solution {

	public static boolean isPalindrome(String str) {
		int i,n=str.length();
        
        for(i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i))
                return false;
        }
        return true;
	}

}
