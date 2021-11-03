
public class solution {

	public static int countZerosRec(int n){
        if(n==0){
            return 1;
        }else
            if(n<=9){
                return 0;
            }
        int digit = n%10;
        n=n/10;
        if (digit ==0)
            return 1 + countZerosRec(n);
        else
            return countZerosRec(n);
	}
}
