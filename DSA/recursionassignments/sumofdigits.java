
public class solution {

	public static int sumOfDigits(int n){
		if(n<=9){
			return n;
		}
        int digit = n % 10;
        int smallAns = n / 10;
		return digit + sumOfDigits(smallAns);
	}
}
