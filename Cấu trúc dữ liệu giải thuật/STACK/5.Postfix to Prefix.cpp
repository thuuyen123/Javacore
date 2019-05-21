#include <iostream>
#include <stack>
using namespace std;

bool toantu(char x){
    if(x == '-' || x == '+' || x == '*' || x == '/' || x == '^') return true;
    return false;
}

void prefix(string x){
    stack <string> s;
    int n = x.size();
    for(int i = 0; i<n; i++){
        if(toantu(x[i])){
            if(!s.empty()){
                string vt1 = s.top(); s.pop();
                string vt2 = s.top(); s.pop();
                string ans = x[i] + vt2 + vt1 ;
                s.push(ans);
            }
        }
        else{
            s.push(string(1, x[i]));
        }
    }
    cout << s.top();
}

main(){
    string s = "AB+CD-*";
    //cin >> s;
    prefix(s);
}
