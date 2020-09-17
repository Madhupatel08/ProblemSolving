que:: Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.
//approach 1
#include<bits/stdc++.h>
using namespace std;
int disD(int yr){
    int count=0;
    int arr[10]={0};
    while(yr>0){
        int res=yr%10;
        arr[res]++;
        yr=yr/10;
    }
    for(int i =0;i<10;i++){
        if(arr[i]==1){
            count++;
        }
    }
    return count;
}
int counD(int yr){
    int count=0;
    while(yr>0){
        count++;
        yr=yr/10;
    }
    return count;
}
int main(){
    int y;
    cin>>y;
    int a=counD(y);
      while (true)
    {
       y=y+1;
        if(4==disD(y)){
            break;
        }
    }
       cout<<y<<endl;
}

///2nd approach
#include<bits/stdc++.h>
using namespace std;
int main(){
    int y;
    cin>>y;
      while (true)
    {
        y += 1;
        int a = y / 1000;
        int b = y / 100 % 10;
        int c = y / 10 % 10;
        int d = y % 10;
        if (a != b && a != c && a != d && b != c && b != d && c != d)
        {
            break;
        }
    }
       cout<<y<<endl;
}
