#include<bits/stdc++.h>
#include<stack>
using namespace std;

main(){
    char s[1000];
    fflush(stdin);
    gets(s);
    int n = strlen(s);
    stack <char> st;
    for(int i=0; i<n; i++){
        if(s[i] != ' '){
            st.push(s[i]);
        }
        if(s[i] == ' ' || i == n-1){
            if(!st.empty()){
                while(!st.empty()){
                    cout << st.top();
                    st.pop();
                }
            }
            cout << " ";
        }
    }
}

