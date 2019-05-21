#include <iostream>
#include <stack>
using namespace std;

bool toantu(char x){
    if (x == '-' || x == '+' || x == '*' || x == '/') return true;
    return false;
}

void prefix(string x){
    stack <string> s;
    int n = x.size()-1;
    for(int i = n; i>=0; i--){
        if(toantu(x[i])){
            string vt1 = s.top(); s.pop();
            string vt2 = s.top(); s.pop();
            string ans = "(" + vt1 + x[i] + vt2 + ")";
            cout << ans << endl;
            s.push(ans);
        }
        else{
            s.push(string(1, x[i]));
        }
    }
    cout << s.top();
}

main(){
    string s = "*-A/BC-/AKL";
    //cin >> s;
    prefix(s);
}
