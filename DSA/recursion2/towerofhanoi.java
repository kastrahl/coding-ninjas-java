
public class solution {

	public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
		// Write your code here
        if(n==1){
            System.out.println(source +" "+ destination);
            return;
        }
        if(n==0)
            return;
        towerOfHanoi(n-1,source/*using source*/,destination/*as helper */,auxiliary /*finally to helper*/);
        System.out.println(source +" "+ destination);
        towerOfHanoi(n-1,auxiliary/*n-1 disks from helper*/,source/*as helper*/,destination/*finally to destination*/);
        
	}
}
