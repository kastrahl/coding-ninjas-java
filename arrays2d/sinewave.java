public class Solution {

	public static void wavePrint(int mat[][]){
        int n=mat.length;
        if(n==0)
            return;
        int m=mat[0].length;
		int total=n*m,i,j=0;
        boolean goingdown=true,goingup=false; //start of sinewave
        while(total>0){
            if(goingdown==true){
                for(i=0;i<n;i++){
                    System.out.print(mat[i][j]+" ");
                    total--;
                }
                j++;
                goingdown=false;
            }else{
                for(i=n-1;i>=0;i--){
                    System.out.print(mat[i][j]+" ");
                    total--;
                }
                j++;
                goingdown=true;
            }
        }
	}
}
