import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int[] maxInLeft=new int[n];///max in left
        int[] maxInRight=new int[n];////max in roght 
        maxInLeft[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            maxInLeft[i]=Math.max(maxInLeft[i-1],arr[i]);
        }
        maxInRight[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            maxInRight[i]=Math.max(arr[i],maxInRight[i+1]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(maxInLeft[i],maxInRight[i])-arr[i];//////total water above each building
        }
        System.out.println(sum);
    }
}
