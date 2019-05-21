#include <bits/stdc++.h>
using namespace std;

bool toanHang(char x){
    return isdigit(x);
}

void evaluation(string x){
    stack <double> s;
    int n = x.size();
    for(int i=n-1; i>=0; i--){
        if(toanHang(x[i])){
            s.push(x[i] - '0');
        }
        else{
            double vt1 = s.top(); s.pop();
            double vt2 = s.top(); s.pop();

            switch(x[i]){
                case '+':{
                    s.push(vt1 + vt2);
                    break;
                }
                case '-':{
                    s.push(vt1 - vt2);
                    break;
                }
                case '/':{
                    s.push(vt1 / vt2);
                    break;
                }
                case '*':{
                    s.push(vt1 * vt2);
                    break;
                }
            }
        }
    }
    cout << s.top();
}

main(){
    string s = "-+7*452";
    // cin >> s;
    evaluation(s);
}
