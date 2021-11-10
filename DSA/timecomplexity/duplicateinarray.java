import java.util.Arrays;
public class Solution {
	public static int findDuplicate(int[] arr) {
		Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                return arr[i];
            }else
                continue;
        }
        return -1;
	}
}
