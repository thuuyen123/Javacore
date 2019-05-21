#include<bits/stdc++.h>
using namespace std;
int A[100][100],n,queue[100],chuaxet[100],truoc[100];
int B[100],d;
deque<int>C;

void nhap(){
	cin>>n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			cin>>A[1][j];chuaxet[j]=1;
		}
	}
}
void nhap2(){
	ifstream fp("dung.txt");fp>>n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			fp>>A[i][j];
		}
	}
}
void BFS(int i){
	int queue[100],high=1,low=1,u,v;
	queue[low]=i;chuaxet[i]=0;
	while(low<=high){
		u=queue[low];low++;
	for(v=1;v<=n;v++){
		if(A[u][v]==1&&chuaxet[v]==1){
			high++;
			queue[high]=v;
			truoc[v]=u;chuaxet[v]=0;
		}
	}
}
}
int kiemtra(){
    int a=1,dem=0;
	while(a<=n){
		a++;
		for(int i=1;i<=n;i++){
			if(A[a][i]==1){
				dem++;
			}
		}
	}
	if(dem%2==0) return 1;
	else return 0;
}
int kiemtra2(){
    int i=0,d=0,s=0;
    for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			s+=A[i][j];
		}
		if(s%2==1) {
			d++;cout<<i<<" "<<endl;
			C.push_back(i);
		}
		else s=0;C.push_back(i);
	}
	A[C.front()][C.back()]=0;A[C.back()][C.front()]=0;
	if(d==2||d==0) return 1;
	else return 0;
}
int xetlienthong(){
	int solt=0;
	for(int i=1;i<=n;i++){
		if(chuaxet[i]==1){
			solt++;
			BFS(i);
		}
	}
	if(solt==1) return 1;
	else return 0;
}
int xetlienthongyeu(){
		int solt=0;	BFS(1);
	for(int i=1;i<=n;i++){
		if(chuaxet[i]==1){
			solt++;
		}
	}
	if(solt==0) return 1;
	else return 0;
}
void tralaichuaxet(){
	for(int i=1;i<=n;i++){
		chuaxet[i]=1;
	}
}
void xeteuler(int u){
	int v,x,top,dCE;
	int stack[100],CE[100];
	top=1; stack[top]=u; dCE=0;
	do{
		v=stack[top];x=1;
		while(x<=n&&A[v][x]==0)
			x++;
		if(x>n){
			dCE++;CE[dCE]=v;top--;
		}
		else{
			top++;stack[top]=x;
			A[v][x]=0;A[x][v]=0;
		}
	}
	while(top!=0);
	for(x=dCE;x>0;x--){
		cout<<" "<<CE[x];
	}
}
class danhsachke{
			public:
				int c[100],t;
				void nhap(){
			cin>>t;
					for(int i=1;i<=t;i++){
						cin>>c[i];
					}						
			}
		};
int main(){
		cout<<"chon bai tu 1->8 : ";
	int choice; cin>>choice;
	if(choice==1){
	    nhap();
		tralaichuaxet();
		if(kiemtra()&&xetlienthong()){
			cout<<"do thi la Euler "<<endl;
			int t;
			cout<<"nhap dinh bat dau chu trinh Euler: "<<endl; cin>>t;
			xeteuler(t);
		}
	}
	if(choice==2){
		nhap();
		tralaichuaxet();
		if(kiemtra2()&&xetlienthongyeu()){
			cout<<"duong di Euler la: "<<endl;
			xeteuler(C.front());
		}
		else cout<<"khong co duong di"<<endl;
	}
	if(choice==3){
		nhap();
		tralaichuaxet();
		if(kiemtra()&&xetlienthong()){
			cout<<"do thi la Euler "<<endl;
			int t;
			cout<<"nhap dinh bat dau chu trinh Euler: "<<endl; cin>>t;
			xeteuler(t);
		}
		else cout<<"khong co chu trinh "<<endl;
	}
	if(choice==4){
		nhap2();
		tralaichuaxet();
		if(kiemtra2()&&xetlienthongyeu()){
			cout<<"duong di EUler la: "<<endl;
			xeteuler(C.front());
		}
		else cout<<"khong co duong di: "<<endl;
	}
	if(choice==5){
	danhsachke dsk[100];
		cout<<"nhap n dinh : "<<endl; cin>>n;
	for(int i=0;i<=n;i++){
			for(int j=1;j<=n;j++){
		    	A[i][j]=0;
					}
			}
		for(int i=1;i<=n;i++){
		cout<<"nhap so canh ke:"<<i<<":"<<endl;
			cout<<"nhap cac canh ke "<<i<<":"<<endl;
			dsk[i].nhap();
			for(int j=1;j<=n;j++){
				for(int k=1;k<=n;k++)
			if(j==dsk[i].c[k]){
				A[i][j]=1;A[j][i]=1;
			}
		}
	}
	tralaichuaxet();
		if(kiemtra()&&xetlienthong()){
			cout<<"do thi la Euler "<<endl;
			int t;
			cout<<"nhap dinh bat dau chu trinh Euler: "<<endl; cin>>t;
			xeteuler(t);
		}
	}
	if(choice==6||choice==8){
	danhsachke dsk1[100];
		cout<<"nhap n dinh : "<<endl; cin>>n;
	for(int i=0;i<=n;i++){
			for(int j=1;j<=n;j++){
		    	A[i][j]=0;
					}
			}
		for(int i=1;i<=n;i++){
		cout<<"nhap so canh ke:"<<i<<":"<<endl;
			cout<<"nhap cac canh ke "<<i<<":"<<endl;
			dsk1[i].nhap();
			for(int j=1;j<=n;j++){
				for(int k=1;k<=n;k++)
			if(j==dsk1[i].c[k]){
				A[i][j]=1;A[j][i]=1;
			}
		}
	}
		tralaichuaxet();
		if(kiemtra2()&&xetlienthongyeu()){
			cout<<"duong di EUler la: "<<endl;
			xeteuler(C.front());
		}
		else cout<<"khong co duong di: "<<endl;
	}
	if(choice==7){
		danhsachke dsk2[100];
		cout<<"nhap n dinh : "<<endl; cin>>n;
	for(int i=0;i<=n;i++){
			for(int j=1;j<=n;j++){
		    	A[i][j]=0;
					}
			}
		for(int i=1;i<=n;i++){
		cout<<"nhap so canh ke:"<<i<<":"<<endl;
			cout<<"nhap cac canh ke "<<i<<":"<<endl;
			dsk2[i].nhap();
			for(int j=1;j<=n;j++){
				for(int k=1;k<=n;k++)
			if(j==dsk2[i].c[k]){
				A[i][j]=1;A[j][i]=1;
			}
		}
	}
		tralaichuaxet();
		if(kiemtra()&&xetlienthongyeu()){
			cout<<"duong di EUler la: "<<endl; 
			cout<<"nhap dinh bat dau: "<<endl;int t;
			cin>>t;
			xeteuler(t);
		}
		else cout<<"khong co duong di: "<<endl;
	}
}

