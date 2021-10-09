public class Solution {

	public static void totalSum(int[][] mat) {
		int i,j,sum=0;
        int rows=mat.length;
        if(rows==0){
            System.out.println("0");
            return;
        }
        int cols=mat[0].length;
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(i==j){
                    //System.out.println(mat[i][j]);
                    sum+=mat[i][j];
                    continue;
                }else
                if(i==0||j==0){
                    //System.out.println(mat[i][j]);
                    sum+=mat[i][j];
                    continue;
                }else
                if(i==rows-1||j==cols-1){
                    //System.out.println(mat[i][j]);
                    sum+=mat[i][j];
                    continue;
                }else
                    if(j==cols-1-i){
                    	//System.out.println(mat[i][cols-1-i]+ " "+ j + " "+ (cols-i-1));
                		sum+=mat[i][cols-1-i];
                    }
            }
        }
        System.out.println(sum);
	}
}
