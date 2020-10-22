//Approach 1== most efficient solution //most important 
class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
       while(m > 0 && n > 0){
            if(A[m-1] > B[n-1]){
                A[m+n-1] = A[m-1];
                m--;
            }else{
                A[m+n-1] = B[n-1];
                n--;
            }
        }
 
        while(n > 0){
            A[m+n-1] = B[n-1];
            n--;
        }
       
        
}
    
}

///approach 2 //normal approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int ans[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n){
               if( nums1[i] < nums2[j] ){
                   ans[k]=nums1[i];
                   i++;
               }  else{
                   ans[k]=nums2[j];
                   j++;
               }
               k++;
        }
        while(i<m){
            ans[k]=nums1[i];
            i++;k++;
        }
        while(j<n){
            ans[k]=nums2[j];
            j++;k++;
        }
        System.arraycopy(ans,0,nums1,0,nums1.length);
}
    
}
