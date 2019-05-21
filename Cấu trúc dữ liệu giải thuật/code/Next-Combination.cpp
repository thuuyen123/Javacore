#include <iostream>
#define MAX 100
using namespace std;
int n, k, X[MAX], OK=1;
void Init(void){
	cout<<"Nhap n, k:"; cin>>n>>k;
	for(int i=1; i<=k; i++){
		X[i]=i;
	}
}
void Result(void){
	for(int i=1; i<=k; i++) cout<<X[i]<<" ";
	cout<<endl;
}

void Init_Dao(void) {
	cout<<"Nhap n, k:"; cin>>n>>k;
	for(int i=n-k+1, t=1; i<=n; i++, t++){
		X[t]=i;
	}
	//Result();	
}
void Next_Combination(void){
	int i=k;
	while(i>0 && X[i]==n-k+i) i--;
	if(i>0){ X[i] = X[i]+1;
		for(int j=i+1; j<=k; j++ ) 
			X[j]= X[i] +j-i;
		
	}
	else OK=0;
}
void Next_Combination1(void){
	int i=1;
	while(i<=k && X[i]!=n-k+i) i++;
	if(i<=k){ 
		for(int j=i+1; j<=k; j++)
			X[i] = X[i]+j-i;
		
		X[i]=X[i]-1;
	}
	else OK=0;
}

int main(void){
	Init_Dao();
	while(OK){
		Result();
		Next_Combination1();
	}
}

