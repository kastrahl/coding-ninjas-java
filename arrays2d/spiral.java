
public class Solution {

	public static void spiralPrint(int a[][]){
        int m=a.length;
        if(m==0)
            return;
        int n=a[0].length;
        int i, k = 0, l = 0;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
}
        
        
/*	int total=n*m,i,j=0,limit=0,int a1=0,a2=0,a3=0,a4=0;
        boolean goingdown=true,goingright=true; //start of sinewave
        while(total>0){
            if(goingright==true){
                for(i=0;i<m;i++){
                    System.out.print(mat[i][j]+" ");
                    total--;
                }
                j++;
                goingright=false;
                goingdown=true;
            }else
            if(goingdown==false){
                for(i=n-1;i>=0;i--){
                    System.out.print(mat[i][j]+" ");
                    total--;
                }
                j++;
                goingdown=true;
            }
            switch(dir){
                case 1:		//going right
                    for(i=0+a1;i<m-a1;i++){
                        System.out.print(mat[a1][i]);
                    }
                    a1++;
                    dir=2;
                    break;
                case 2:		//going down
                    for(i=0+a1;i<n-a2;i++){
                        System.out.print(mat[][i]);
                    }
                    a2++;
                    dir=3
                    break;
                case 3:		//going left
                    for(i=0+a2;i<m-a3;i++){
                        System.out.print(mat[a1][i]);
                    }
                    a3++;
                    dir=4
                    break:
                case 4:		//going up
                    for(i=0+a3;i<n-a4;i++){
                        System.out.print(mat[a1][i]);
                    }
                    a4++;
                    dir=1;
                    break:
            }*/
            
