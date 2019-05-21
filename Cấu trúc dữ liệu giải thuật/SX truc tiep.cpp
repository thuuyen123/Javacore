#include<iostream>
using namespace std;

int n,b;
int a[101];

int main(){
	cin>>n;
	for(int i=1;i<=n;i++)
		cin>>a[i];
	for(int i=1;i<n;i++){
		for(int j=i+1;j<=n;j++){
			if(a[i]>a[j]){
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
		
			}	
		}
		cout<<"Buoc "<<i<<":";
		for(int k=1;k<=n;k++)
			cout<<" "<<a[k];
			cout<<endl;
	}

}
