
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	int i, j, temp,n=arr.length,k=n-d,count=n-1; 
        for(i = 0; i < n / 2; i++){
            temp = arr[i]; 
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for(i = 0; i < k/2; i++){
            temp = arr[i]; 
            arr[i] = arr[k-i-1];
            arr[k-i-1] = temp;
        }count=1;
        for(i = k; i < (n+k)/2; i++){
            temp = arr[i]; 
            arr[i] = arr[n-count];
            arr[n-count] = temp;
            count++;
        }   
    }
}
