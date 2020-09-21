///O(n)Time complexity(optimized Approach)
      //7 -8 4 7 -8 4 7 -8 4

        // 2 -3 4 2 -3 4 2 -3 4
        // 2 -3 2 -3 2 -3
        // -5 -3 10 -5 -3 10 -5 -3 10

#include <iostream>
using namespace std;
#define ll long long 

ll max_subarray_sum(ll *a, ll n, ll k) {
    long long int max_so_far = a[0];
	long long int max_ending_here = 0;
    for (int i = 0; i < n * k; i++) {
	       // max_ending_here += a[i % n];
	        if (max_ending_here < 0) {
	            max_ending_here = a[i % n];
	        }
	        else {
	            max_ending_here += a[i % n];
	        }
	        
	        if (max_so_far < max_ending_here) {
	            max_so_far = max_ending_here;
	        } 
	}
	return max_so_far;
}


int main() {
    // ios_base::sync_with_stdio(false);
    // cin.tie(NULL);
    
	int t;
	cin >> t;
	while (t--) {
	    ll n, k;
	    cin>>n>>k;
	    ll * a=new ll[n];
	    ll arr_sum = 0;
	    for (int i = 0; i < n; i++) {
	        cin >> a[i];
	        arr_sum += a[i];
	    }
	    
	    if(k > 1) {
    	    if (arr_sum < 0) {
    	        cout << max_subarray_sum(a, n, 2) << endl;
    	    } else {
    	        ll ans = max_subarray_sum(a, n, 2);
    	        cout << ans + arr_sum*(k-2)  << endl;
    	    }
	    }
	    else if(k == 1) {
	        cout<< max_subarray_sum(a,n,1) <<endl;
	    }
	   
	    //cout << max_so_far << endl;
	}
	return 0;
}
