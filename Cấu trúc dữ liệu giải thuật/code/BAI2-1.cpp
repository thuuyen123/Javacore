#include <bits/stdc++.h>
using namespace std;
int dem=0;
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
int Change(int A[], int x, int n){
	int k=0, t=1;
	while((int) pow(t, n)<=x){
		A[k]= (int) pow(t, n); k++;t++;
	}	
	return k;
} 
int F(int A[], int k, int x, int i){
	if(i<k){
		int val = x-A[i];
		if(val==0) return 1;
		if(val <0) return 0;
		return(F(A, k, val, i+1) + F(A, k, x, i+1));			
	}
	return 0;
}
int CountWays(int x, int n) {
	int A[1000], k= Change(A,x,n);
    return F(A, k, x, 0);
}
int F1(int A[], int k, int x, int i){
     for(int j=0; j<=1; j++){
         x = x- A[i]*j;         
         if ( i==k-1 ) { 
		 	if(x==0) dem++; 
		 }
         else if (x>=0) F1(A, k, x, i+1);     
         x = x+A[i]*j;         
     }
     return dem;
}

int Branch_And_Bound(int x, int n){
	int A[1000], k= Change(A,x,n);
	return(F1(A, k, x,0));
}
int SubSet_Sum(int x, int n){
	int A[1000], dem=0, k= Change(A,x,n);
	long long total = 1<<k; 
    for (long long i=0; i<total; i++){
        long long sum = 0;
        for (long long  j=0; j<k; j++){
        	if (i & (1<<j))
                sum += A[j];
		}
        if(sum==x) dem++;    
    }    
    return dem;
}
int main() {
    int x = 500, n = 2;
    //cout << CountWays(x, n);
    cout << countWays(x, n);
    //cout << Branch_And_Bound(x, n);
    //cout << SubSet_Sum(x, n);
    return 0;
}
