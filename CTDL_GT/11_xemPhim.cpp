/*
	NEWPTIT
*/
#include<bits/stdc++.h>

using namespace std;
int F[50][7005]; // F[i][j] - khoi luong max khi xet vat 1- i, suc chua toi da j
int w[50];

int main(){
	int c, n;
	cin>>c>>n;
	for(int i=1;i<=n;i++)
		cin>>w[i];
	for(int i=1;i<=n;i++)
		for(int j=1;j<=c;j++){
			if(w[i]<=j)
				F[i][j]=max(F[i-1][j], w[i] + F[i-1][j-w[i]]);
			else
				F[i][j]=F[i-1][j];
		}
	cout<<F[n][c];
	return 0;
}

