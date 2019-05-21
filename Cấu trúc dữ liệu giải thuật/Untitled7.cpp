#include<iostream>
using namespace std;

int n;
int a[101];

int main(){
	cin>>n;
	for(int i=0;i<n;i++)
		cin>>a[i];
	for(int i=0;i<n;i++){
		bool kt=0;
		for(int j=0;j<n-i-1;j++){
//			kt=0;
			if(a[j]>a[j+1]){
				kt=1;
				int c=a[j];
				a[j]=a[j+1];
				a[j+1]=c;
			}
		}
		if(kt){
			cout<<"Buoc "<<i+1<<": ";
			for(int j=0;j<n;j++)
				cout<<a[j]<<" ";
			cout<<endl;
		}
	}
}
