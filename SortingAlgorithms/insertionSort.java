//we assume the first element we choosed in its correct position 
//we will see all the elements we have seen before and if they are greater than current element we will shift them to right by creating a gap we
//we store the current elemnt in a seperate variable 

//time complexity : O(n^2) is worst case
//best case Time complexity : O(n)
   
   public static void print(int[] arr){
        for(int i = 0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void insertionSort1(int n, int[] arr) {
    //we assume that first element is sorted so started with index 1
        for(int i = 1 ; i < n ; i++){
            int current = arr[i];
            int j = i-1;
            while(j >=0 && arr[j]>current){
                arr[j+1] = arr[j];//we shift all the greater element is left to the right and create space for the current location and value
                j--;
                 print(arr); 
            }
            arr[j+1] = current ;
            //  print(arr);
        }
        print(arr); 
    }
