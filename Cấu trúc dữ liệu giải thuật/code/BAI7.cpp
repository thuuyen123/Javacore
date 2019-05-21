#include <bits/stdc++.h>
using namespace std;
void Tachso(char s[]){
    int l = strlen(s); 
    for(int i = 0; i < pow(2, l - 1); i++){
        int k = i, x = 0;
        cout << s[x]; x++;
        for(int j = 0; j < strlen(s) - 1; j++){ //luon duyettren xau s[]            
            if(k & 1) //neu khac 0 dua ra ky tu rong
                cout << " ";
            k = k >> 1;//dich phai 1 bit
            cout << s[x];//dua ra s[x]
            x++;
        }
        cout << "\n";//duoc mot lan        
    }
}
int main() { 
    char input[] = "1214";
    Tachso(input);     
    return 0;
}
