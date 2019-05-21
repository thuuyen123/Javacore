/*
Input:    4    13 7 6 12 
Output:-1 12 12 -1
*/
#include<bits/stdc++.h>
using namespace std;
void nextGreater(int a[], int n){
    stack <int> s;
    s.push(a[0]);// day vao stack a[0] stt = 12
    for(int i=1; i<n; i++){
        int stt = a[i];// stt la phan tu dau tien cua mang stt = 13
        if(s.empty() == false){// mang s khong rong
            int pts = s.top();// pst là phan tu dau tien ben phai(dung)
            s.pop();// loai bo ra khoi stack
            while(pts < stt){
                cout << stt << endl;
                if(s.empty() == true){
                    break;
                }
                pts = s.top();
                s.pop();
            }
            if(pts > stt){
            	cout<<"-1"<<endl;
                s.push(pts);
            }
        }
        s.push(stt);
    }
}

int main(){
    int n, a[1000]; cin >> n;
    for(int i=0; i<n; i++) cin >> a[i];
    nextGreater(a, n);
}
