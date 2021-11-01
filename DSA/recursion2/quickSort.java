/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		quickSort(input, 0, input.length - 1);
	}
    public static void quickSort(int[] arr, int si, int ei){
        //int pivot=input[si];
        if(si>=ei){
            return;
        }
        int pivot = partition(arr,si,ei);
        quickSort(arr,si,pivot-1);
        quickSort(arr,pivot+1,ei);
	}
	public static int partition(int []arr,int sti,int ei){
        int pivot=arr[sti];
        int smallnumbers=0;
        for(int i=sti+1;i<=ei;i++){
            if(arr[i]<pivot)
                smallnumbers++;
        } 
        int temp=arr[sti+smallnumbers];
        arr[sti+smallnumbers]=pivot;
        arr[sti]=temp;
        int i=sti,j=ei;
        while(i<j){
            if(arr[i]<pivot){
                i++;
            }else
            if(arr[j]>=pivot){
                j--;
            }else{
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                i++;
                j--;
            }
        }
        return  sti+smallnumbers;
    }
}
