// C++ program for Binary To Gray 
// and Gray to Binary conversion
#include <iostream>
using namespace std;
char xor_c(char a, char b) { 
	if(a==b) return('0');
	else return ('1'); 
}
char flip(char c) { 
	if (c == '0') return ('1');
	else return('0'); 
}
string binarytoGray(string binary) {
    string gray = ""; //khoi tao gray code la rong     
    gray += binary[0];//bit dau tien bao gio cung giong nhau
	//cac bit con lai duoc tinh bang Bit truoc do XOR voi bit hien tai 
    for (int i = 1; i < binary.length(); i++) {        
        gray += xor_c(binary[i - 1], binary[i]);
    } 
    //"01001"->"01101"
    return gray;
}
string graytoBinary(string gray){
    string binary  = ""; 
    binary += gray[0];//bit 0 bao gio cung giong nhau
    // cac bit con lai duoc tinh nhu sau
    for (int i = 1; i < gray.length(); i++) {
        // If current bit is 0, concatenate
        // previous bit
        if (gray[i] == '0') //neu bit hien tai la 0
            binary += binary[i - 1]; //noi no voi bit truoc do      
        else //noi no voi dao cua bit truoc do
            binary += flip(binary[i - 1]);
    }
	//"01101" ->"01001 
    return binary;
}
 
// Driver program to test above functions
int main()
{
    string binary = "01101";
    cout << "Gray code of " << binary << " is "
         << binarytoGray(binary) << endl;
 
    string gray = "0111";
    cout << "Binary code of " << gray << " is "
         << graytoBinary(gray) << endl;
    return 0;
}

