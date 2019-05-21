#include<iostream>
using namespace std;

int n,b,Min;
int a[101];
//sx truc tiep
int main(){
	cin>>n;
	for(int i=1;i<=n;i++)
		cin>>a[i];
	for(int i=1;i<n;i++){
		Min=i;
		for(int j=i+1;j<=n;j++){
			if(a[Min]>a[j]){
				Min=j;
			}

		}	
		if(Min !=i){
			int c=a[i];
			a[i]=a[Min];
			a[Min]=c;
		}
		cout<<"Buoc "<<i<<":";
		for(int k=1;k<=n;k++)
			cout<<" "<<a[k];
			cout<<endl;
	}
}


