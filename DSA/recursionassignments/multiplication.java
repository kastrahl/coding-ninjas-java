
public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		if(n==1){
            return m;
        }else
            return m+multiplyTwoIntegers(m,n-1);
	}
}
