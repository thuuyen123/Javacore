#include<iostream>
using namespace std;
//sx
int n;
int a[101];

int main(){
	cin>>n;
	for(int i=0;i<n;i++)
		cin>>a[i];
	int j;
	bool ktra = 0;
	for(int i=0;i<n;i++){
		ktra = 0;
		for(int i=0;i<n;i++){
		int j=i+1;
		if(a[i]>a[j]&&j<n){
			ktra = 1;
			int c=a[i];
			a[i]=a[j];
			a[j]=c;
		}
	}
	if ( ktra ){
		cout<<"Buoc "<<i<<":";
		for(int j=0;j<n;j++)
			cout<<" "<<a[j];
		cout<<endl;
		}
	}
	
}


