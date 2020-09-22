//////partitioning problem
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }   
public static void sort(int[]a){
        int i=0;// j to i is 1
    int j=0;//0 to j-1 is 0's 
    int k=arr.length-1;//k+1 to end is 2's
    ///i to k is unknown
    while(i<=k){
        if(arr[i]==0){
            swap(arr,i,j);
            i++;j++;
        }else if(arr[i]==1){
            i++;
        }else{
            swap(arr,i,k);
            k--;
        }
    } 
                
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
       sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
