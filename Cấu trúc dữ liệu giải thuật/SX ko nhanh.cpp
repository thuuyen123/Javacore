#include<iostream>
#include<algorithm>
using namespace std;

int n,t;
long long a[1000001];


int main(){
	cin>>t;
	while(t--){
		cin>>n;
		for(int i=0;i<n;i++)
			cin>>a[i];
		
		stable_sort(a,a+n);
		for(int i=0;i<n;i++)
			cout<<a[i]<<" ";
		cout<<endl;
	}
	
}
