#include <bits/stdc++.h>
using namespace std;

bool toanHang(char x){
    return isdigit(x);
}
void evaluation(string x){
    stack <double> s;
    int n = x.size();
    for(int i=0; i<n; i++){
        if(toanHang(x[i])){
            s.push(x[i] - '0');
        }
        else{
            double vt1 = s.top(); s.pop();
            double vt2 = s.top(); s.pop();

            switch(x[i]){
                case '+':{
                    s.push(vt2 + vt1);
                    break;
                }
                case '-':{
                    s.push(vt2 - vt1);
                    break;
                }
                case '/':{
                    s.push(vt2 / vt1);
                    break;
                }
                case '*':{
                    s.push(vt2 * vt1);
                    break;
                }
            }
        }
    }
    cout << s.top();
}

main(){
    string s = "875*+9-";
    // cin >> s;
    evaluation(s);
}
