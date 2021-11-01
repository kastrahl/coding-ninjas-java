public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
		if(input.length<=1){
            return;
        }
        int a[]=new int[input.length/2];
        int b[]=new int[input.length-a.length];
        for(int i=0;i<a.length;i++){
            a[i]=input[i];
        }
        for(int i=input.length/2;i<input.length;i++){
            b[i-input.length/2]=input[i];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,input);
	}
    public static void merge(int [] s1,int [] s2,int [] d){
        int i=0,j=0,k=0;
        while(i<s1.length&&j<s2.length){
            if(s1[i]<=s2[j]){
                d[k]=s1[i];
                i++;
                k++;
            }else
            if(s1[i]>s2[j]){
                d[k]=s2[j];
        	    j++;
                k++;
            }
        }
        if(i<s1.length){
            while(i<s1.length){
                d[k]=s1[i];
                i++;
                k++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k]=s2[j];
                j++;
                k++;
            }
        }
    }
}
