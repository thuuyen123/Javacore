#include <iostream>
#define MAX 15
using namespace std;
int X[MAX], COT[MAX],XUOI[2*MAX], NGUOC[2*MAX], dem=0, n;
int s, t;
void Init(void){
	cout<<"Nhap n:"; cin>>n;
	cout<<"Nhap  s, t:"; cin>>s>>t;
	for(int i=0; i<=MAX; i++) COT[i]=true;
	for(int i=0; i<=2*MAX; i++) {
		XUOI[i]=true;NGUOC[i]=true;	
	} 	
	X[s]=t; COT[t]=false; XUOI[s-t+n]=false; NGUOC[s+t-1]=false;	
}
void Result(void){ 
	cout<<"\n Nghiem thu "<<dem++<<":";
	for(int i=1; i<=n; i++) cout<<X[i]<<" ";	
}
void Try(int i){
	if(i!=s){
		for(int j=1; j<=n; j++){
			if(COT[j]&&XUOI[i-j+n] && NGUOC[i+j-1]) {
				X[i]=j; COT[j]=false;
				XUOI[i-j+n]=false;NGUOC[i+j-1]=false;
				if(i==n) Result();
				else Try(i+1);
				COT[j]=true;XUOI[i-j+n]=true;NGUOC[i+j-1]=true;
			}
		}
	}
	else if(s==n) Result();
	else Try(i+1);
	
}	
int main(void){ 
	Init();Try(1);	
}
