import java.util.Arrays;
public class Solution {

	public static int findUnique(int[] arr) {
		Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length-1;i=i+2){
            if(arr[i]==arr[i+1])
                continue;
            else
                return arr[i];
        }
        return arr[arr.length-1];
	}
}
