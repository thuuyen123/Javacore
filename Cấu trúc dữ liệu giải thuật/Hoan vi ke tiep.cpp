#include<iostream>
#include<cstring>
using namespace std;
//dang submit
string c;
int t,x,n;

void sinh(){
	int i=n-1;
	while(c[i] >= c[i+1]) i--;
	if( i == 0) cout<<x<<" BIGGEST"<<endl;
	else {
		int j = n;
		while( c[j] <= c[i]) j--;
		int a=c[j];
		c[j]=c[i];
		c[i]=a;
		cout<<x<<" ";	
		for(int k=1;k<=i;k++)
			cout<<c[k];
		for(int l=n;l>i;l--)
			cout<<c[l];	
	cout<<endl;
	}
}
int main(){
	cin>>t;
	while(t--){
		cin >> x>>c;
		n = c.length();
		c=" "+c;
		sinh();
	}
}
