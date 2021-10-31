
public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int result = findx(input,x,0);
        return result;
	}
    public static int findx(int arr[],int x,int si){
        if(si==arr.length-1&&arr[arr.length-1]!=x){
            return -1;
        }
        if(arr[si]==x){
            return si;
        }else
            return findx(arr,x,si+1);
    }
	
}
