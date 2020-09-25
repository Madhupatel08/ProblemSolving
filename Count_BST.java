///catlan number
import java.util.Scanner;

public class level_up_catalan_parentheses {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//n represents the total number of keys in the binary search trees..
		int n = scn.nextInt();
		System.out.println(getprob(n));
		
	}
	public static int getprob(int n) {
		//code to count number of BSTs
        int[] t=new int[n+1];
        t[0]=1;
        t[1]=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                t[i]+=t[j]*t[i-j-1];
            }
        }
        int ans=t[n];
        return ans;
	}
}
