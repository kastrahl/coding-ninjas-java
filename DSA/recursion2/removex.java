public class solution {
	// Return the changed string
	public static String removeX(String input){
		// Write your code here
        if(input.length()==0){
            return input;
        }
        String smalloutput=removeX(input.substring(1));
        if(input.charAt(0)=='x'){
            return smalloutput;
        }else
            return input.charAt(0)+smalloutput;
	}
}
