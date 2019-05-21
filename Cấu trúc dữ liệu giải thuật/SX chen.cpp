#include<iostream>
using namespace std;
//sx chen
int n;
int a[101];

int main(){
	cin>>n;
	for(int i=0;i<n;i++)
		cin>>a[i];
	cout<<"Buoc "<<0<<": "<<a[0]<<endl;	
	for(int i=1;i<n;i++){
		int j=i-1;
		int temp=a[i];
		while(a[j]>temp){
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=temp;
		cout<<"Buoc "<<i<<":";
		for(int j=0;j<=i;j++)
			cout<<" "<<a[j];
		cout<<endl;
	}
}
