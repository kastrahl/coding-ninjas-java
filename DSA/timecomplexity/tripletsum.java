import java.util.Arrays;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
        int i=0,j=1,k=2,count=0;
        int size=arr.length;
        while(i<size-2)
        {
            while(j<size-1)
            {
                while(k<size)
                {
                    if(arr[i]+arr[j]+arr[k]==num)
                        count++;
                    k++;  
                }
              j++;
              k=j+1;
            }
          i++;
          j=i+1;
          k=j+1;  
        }
        return count;
	}
}
