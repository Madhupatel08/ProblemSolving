/////O(log n)
static int BSearch(int[] arr,int low,int hi,int target){
        while(low<=hi){
            int mid=(hi+low)/2;
            if(arr[mid]<target){
                low=mid+1;
            }else if(arr[mid]>target){
                hi=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int pivot_index( int array[]){
        int lo=0;int hi=array.length-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(array[mid] <array[hi]){
                hi=mid;
            }else{
                lo=mid+1;
            }
        }
        return hi;
    }
    static int Search(int array[], int target)
	{
	    // code here
	    int pivotIdx=pivot_index(array);
	    int ans1=BSearch(array,0,pivotIdx,target);
	    if(ans1==-1){
	        ans1=BSearch(array,pivotIdx,array.length-1,target);
	        return ans1;
	    }else{
	        return ans1;
	    }
	   // return -1;
	}
