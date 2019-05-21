#include<iostream>
using namespace std;

int c[11][11],a[11],chuaxet[11];
int n,k, dem = 0;

bool ktra(){
		int t=0;
	for(int i=1;i<=n;i++)
		t+=c[i][a[i]];
	if( t== k) {
		dem++;
		return true;
	}
}
void xuat(){
		for(int i=1;i<=n;i++)
			cout<<a[i]<<" ";
		cout<<endl;
}
void tim(int i){
	for(int j=1;j<=n;j++){
		if(chuaxet[j] == 0){
			a[i]=j;
			chuaxet[j] = 1;
			if(i==n)
				if( ktra()== true)
					xuat();
			else
				tim(i+1);
			chuaxet[j]=0;
		}
	}
}

void tinh(int i){
	for(int j=1;j<=n;j++){
		if(chuaxet[j] == 0){
			a[i]=j;
			chuaxet[j] = 1;
			if(i==n)
				ktra();
			else
				tim(i+1);
			chuaxet[j]=0;
		}
	}
}
int main(){
	cin>>n>>k;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++)
			cin>>c[i][j];
	}
	tinh(1);
	cout << dem << endl ;
	tim(1);
}
