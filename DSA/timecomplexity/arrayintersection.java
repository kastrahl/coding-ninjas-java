import java.util.Arrays;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i=0,j=0, count = 0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
                count++;
            }else 
                if(arr1[i]<arr2[j])
                	i++;
            else
                if(arr1[i]>arr2[j])
                	j++;
        }
        //System.out.println();
        //System.out.print(count+" ");
	}
}
