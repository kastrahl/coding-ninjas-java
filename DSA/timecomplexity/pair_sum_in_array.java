import java.util.Arrays;
public class Solution {	
	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int i=0,j=arr.length-1,count=0;
        while(i<j){
            if(arr[i]+arr[j]==num){
                j--;
                count++;
                if(i<arr.length-1&&i==j){ //for test case 3 3 3 3 3 output = 10 , not 4 thus to check permutation in case of repeated numbers 
                    i++;
                    j=arr.length-1;
                }
            }
            if(arr[i]+arr[j]>num){  // to  decrease the end pointer to array element
                j--;
                continue;
            }
            if(arr[i]+arr[j]<num){  //to increase the start pointer in array element 
                i++;
                j=arr.length-1;
                continue;
            }
        }
        return count;
	}
}
