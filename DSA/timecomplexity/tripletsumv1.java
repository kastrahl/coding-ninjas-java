import java.util.Arrays;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
        int i=0,j=arr.length-1,k=0,count=0;
        for(k=0;k<arr.length-2;k++){
            i=k+1;
            j=arr.length-1;
            while(i<j){
                if(arr[k]+arr[i]+arr[j]==num){
                    j--;
                    count++;
                    if(i<arr.length-1&&i==j){ //for test case 3 3 3 3 3 output = 10 , not 4 thus to check permutation in case of repeated numbers 
                        i++;
                        j=arr.length-1;
                    }
                }
                if(arr[i]+arr[j]>num){
                    j--;
                    continue;
                }
                if(arr[i]+arr[j]<num){
                    i++;
                    j=arr.length-1;
                    continue;
                }
            }
        }
        return count;
	}
}
