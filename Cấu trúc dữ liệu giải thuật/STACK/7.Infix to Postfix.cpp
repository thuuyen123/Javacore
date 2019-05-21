#include<bits/stdc++.h>
using namespace std;

bool toantu(char x){
    if(x == '-' || x == '+' || x == '*' || x == '/' || x == '^') return true;
    return false;
}

void postfix(string x){

    stack <string> s;
    int n = x.size();
    for(int i=0; i<n; i++){
        if(x[i] >= 'a' && x[i] <='z'){
            cout << x[i];
        }
        else if(x[i] == ')'){
            cout << s.top(); s.pop();
        }
        else if(toantu(x[i])){
            s.push(string(1, x[i]));
        }
    }
}

main(){
    string s = "((a+(b*c))/d)";
    //cin >> s;
    postfix(s);
}
