
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
        if(s.length()==1){			//base case
            return Character.toString(s.charAt(0));
        }
        if(s.charAt(0)==s.charAt(1)){
            return Character.toString(s.charAt(0)) +"*" + addStars(s.substring(1));
        }else
            return Character.toString(s.charAt(0)) + addStars(s.substring(1));
	}
}
