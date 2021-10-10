
public class Solution {	
	public static String minLengthWord(String input){
		int i,j,min=0,temp,n=input.length(),lastind=0;
        String word="",smallestword="";
        input.trim();
        input+=" ";
        int max=input.length();
        for(i=0;i<=n;i++){
            if(input.charAt(i)==' '){
                word=input.substring(lastind,i);
                if(word.length()<max){
                    max=word.length();
                    smallestword=word;
                }
                word="";
                lastind=i;
            }
        }
        return smallestword.trim();
	}
}
