public class solution {
	public static int convertStringToInt(String str){
        int num=str.charAt(0)-48;
        //System.out.println(num);
		if(str.length()==1){
            //System.out.println(str.charAt(0)-48);
            return str.charAt(0)-48;
        }
        int sum = num*(int)Math.pow(10,str.length()-1) + convertStringToInt(str.substring(1));
        //System.out.println(sum);
        return sum;
	}
}
