//dp : complexity: O(n^2)
public class Solution {
    public static int Max_Sum_increasing_subseq(int[] arr){
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            int max=0;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    max=Math.max(max,dp[j]);
                    
                }
            }
            dp[i]=max+arr[i];
        }
        int ans=dp[0];
        for(int i=1;i<dp.length;i++){
            if(dp[i]>ans){
               ans=dp[i]; 
            }
        }
        return ans;
    } 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
        System.out.println(Max_Sum_increasing_subseq(arr));
    }
}
