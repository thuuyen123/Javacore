#include<bits/stdc++.h>
using namespace std;

bool toantu(char x){
    if(x == '-' || x == '+' || x == '*' || x == '/' || x == '^') return true;
    return false;
}

void prefix(string x){
    stack <string> s;
    int n = x.size();
    for(int i=0; i<n; i++){
        if(toantu(x[i])){
            string vt1 = s.top(); s.pop();
            string vt2 = s.top(); s.pop();
            string ans = "(" + vt2 + x[i] + vt1 + ")";
            s.push(ans);
        }
        else{
            s.push(string(1, x[i]));
        }
    }
    cout << s.top();
}

int main(){
    string s = "abc++";
    //cin >> s;
    prefix(s);
}
