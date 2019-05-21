#include<bits/stdc++.h>
#include<stack>
using namespace std;

bool check(string x){
    int n = x.size();
    stack <char> s;
    for(int i = 0; i<n; i++){
        if(x[i] == '(' || x[i] == '[' || x[i] == '{'){
            s.push(x[i]);
        }
        else if(x[i] == ')' || x[i] == ']' || x[i] == '}'){
            char top = s.top();
            cout << top << x[i];
            //string u = x[i];
            if( strcmp(top, x[i])){
                cout << "ok";
                s.pop();
            }
            else{
                cout << "nooo";
                return false;
            }
        }
    }
    return true;
}

main(){
    string s = "{([])}";
    // cin >> s;
    if(check(s)) cout << "true";
    else cout << "false";
}

