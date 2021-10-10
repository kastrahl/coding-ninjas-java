import java.util.*;
public class Solution {
	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 
        int i=0,j=0,n=input.length,maxele=input[n-1],maxeleind=n-1;
        int[] lead=new int[n];
        for(i=n-1;i>0;i--){
            if(input[i]>=maxele){
                maxele=input[i];
                maxeleind=i;
                lead[j++]=maxele;
            }
        }
        for(i=0;i<lead.length;i++){
            System.out.print(lead[i]+" ");
        }*/
        int size=input.length,i=0,j=size-1;
        int max_from_right =  input[size-1];
        int[] lead=new int[size];
        /* Rightmost element is always leader */
        lead[j--]=max_from_right;
        String leaders="";
        leaders=Integer.toString(max_from_right)+leaders;
        //System.out.print(max_from_right + " ");
        for (i = size-2; i >= 0; i--)
        {
            if (max_from_right <= input[i])
            {          
            max_from_right = input[i];
            leaders=Integer.toString(max_from_right)+" "+leaders;
        	lead[j--]=max_from_right;
            }
        } 
        System.out.println(leaders);
	}
}
