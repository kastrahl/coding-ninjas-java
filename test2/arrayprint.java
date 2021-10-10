public class solution {
	public static void print2DArray(int input[][]) {
        int i,j,n=input.length,count=0,counter=n;
        if(n==0)
            return;
        int m=input[0].length;
     /*   for(i=0;i<n;){
            for(j=0;j<m;j++){
                System.out.print(input[i][j]+" ");
            }
            count++;
            if(count==counter)
            {
                counter--;
                i++;
            }
        }*/
        i=0;
        while(count<counter){
            for(j=0;j<m;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
            count++;
            if(count==counter)
            {
                counter--;
                count=0;
                i++;
            }
        }
	}
}
