#include <iostream>
using namespace std;
#define MAX 100
int n, X[MAX], OK=1;
void Init(void){
	cout<<"Nhap n="; cin>>n;
	for(int i=1; i<=n; i++) X[i]=i;	
}
void Result(void){
	for(int i=1; i<=n; i++){
		cout<<X[i]<<" ";
	}
	cout<<endl;
}
void Next_Permutation(void){
	int j=n-1;
	while(j>0 && X[j]>X[j+1]) j--;
	if(j>0) {
		int k=n;
		while(X[j]>X[k]) k--;
		int t = X[j]; X[j]=X[k]; X[k]=t;
		int r =j+1, s=n;
		while(r<=s) {
			t =X[r]; X[r]=X[s]; X[s]=t;
			r++; s--;
		}
	}
	else OK=0;
}
void Init1(void){
	cout<<"Nhap n="; cin>>n;
	for(int i=n, t=1; i>=1; i--, t++) X[t]=i;	
}
void Next_Permutation1(void){
	int j=n-1;
	while(j>0 && X[j]<X[j+1]) j--;
	if(j>0) {
		int k=n;
		while(X[j]<X[k]) k--;
		int t = X[j]; X[j]=X[k]; X[k]=t;
		int r =j+1, s=n;
		while(r<=s) {
			t =X[r]; X[r]=X[s]; X[s]=t;
			r++; s--;
		}
	}
	else OK=0;
}

int main(void){
	Init1();
	while(OK){
		Result();
		Next_Permutation1();		
	}	
}
