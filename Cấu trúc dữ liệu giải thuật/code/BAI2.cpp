#include <bits/stdc++.h>
using namespace std;
int countWaysUtil(int x, int n, int num) {
    // Base cases
    int val = (x - pow(num, n));
    if (val == 0)
        return 1;
    if (val < 0)
        return 0; 
    return countWaysUtil(val, n, num + 1) + countWaysUtil(x, n, num + 1);
} 
// Returns number of ways to express
// x as sum of n-th power of two.
int countWays(int x, int n) {
    return countWaysUtil(x, n, 1);
}
 // Driver code
int F(int A[], int x, int n){
	int k=0, t=1;
	while((int) pow(t, n)<=x){
		A[k]= (int) pow(t, n); k++;t++;
	}
	//for(int i=0; i<k; i++) cout<<A[i]<<" ";
	return k;
}
int main() {
    int x = 100, n = 2;int A[1000];
    cout<<F(A, x, n);
    //cout << countWays(x, n);
    return 0;
}
