#include<bits/stdc++.h>
using namespace std;
#define ll long long 
///O(n)Time complexity
ll max_subarray_sum(ll a[], ll n, ll k) {
    long long int max_so_far = INT_MIN;
    long long int max_ending_here = 0;
    for (ll i = 0; i < n * k; i++) {
            max_ending_here += a[i % n];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            } 
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
    return max_so_far;
}
//7 -8 4 7 -8 4 7 -8 4

int main() {
        ll n, k;
        cin >> n>> k;
        long long int a[n];
        ll arr_sum = 0;
        for (ll i = 0; i < n; i++) {
            cin >> a[i];
            arr_sum += a[i];
        }
        // 2 -3 4 2 -3 4 2 -3 4
        // 2 -3 2 -3 2 -3
        // -5 -3 10 -5 -3 10 -5 -3 10
        if (k <= 2) {
            cout << max_subarray_sum(a, n, k) << endl;
        } else if (arr_sum < 0) {
            cout << max_subarray_sum(a, n, 2) << endl;
        } else {
            ll ans = max_subarray_sum(a, n, 2);
            cout << ans + arr_sum*(k-2)  << endl;
        }
       
        //cout << max_so_far << endl;
    return 0;
}
