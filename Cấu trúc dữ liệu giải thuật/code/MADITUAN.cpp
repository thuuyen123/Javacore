#include<stdio.h>
#define N 8
 
int solveKTUtil(int x, int y, int movei, int sol[N][N],
                int xMove[],  int yMove[]);
 
// Kiem tra quan ma co dat duoc vao vi tri (x,y) hay khong  
bool isSafe(int x, int y, int sol[N][N]) {
    return ( x >= 0 && x < N && y >= 0 &&
             y < N && sol[x][y] == -1);
}
void Result(int sol[N][N]){ //in ra ma tran ket qua: sol[][] 
    for (int x = 0; x < N; x++){
        for (int y = 0; y < N; y++)
            printf(" %2d ", sol[x][y]);
        printf("\n");
    }
}
//Chu y bai toan co rat nhieu nghiem ta chi dua ra mot nghiem
//Bai toan tong quat co den 26,534,728,821,064 cach di khac nhau
bool solveKT() {
    int sol[N][N]; //ma tran ket qua     
    for (int x = 0; x < N; x++) //khoi tao ma tran voi gia tri -1
        for (int y = 0; y < N; y++)
            sol[x][y] = -1;
    //xMove[] la gia tri hang dich chuyen tiep theo
    //yMove[] la gia tri cot dich chuyen tiep theo
    int xMove[8] = {  2, 1, -1, -2, -2, -1,  1,  2 };
    int yMove[8] = {  1, 2,  2,  1, -1, -2, -2, -1 };     
    sol[0][4]  = 0;// Gia su quan ma dat o dau tien x=0, y=0
    /* Bat dau tai toa do x=0, y=0, buoc di :1 voi 
       phep di chuyen xMove[], yMove[]
		- Neu di chuyen het 64 o ta co giai phap
		- Nguoc lai khong co giai phap
	 */
    if (solveKTUtil(0, 4, 1, sol, xMove, yMove) == false) {
        printf("Khong co cach di");
        return false;
    }
    else //dua ra giai phap
        Result(sol); 
    return true;
}
 
/* A recursive utility function to solve Knight Tour
   problem */
int solveKTUtil(int x, int y, int movei, int sol[N][N],
                int xMove[N], int yMove[N]) {
   int k, next_x, next_y;
   if (movei == N*N) //neu di du 64 o
       return true;
   /* thu tat ca cac kha nang di chuyen tiep theo tu (x,y)*/
   for (k = 0; k < 8; k++) {
       next_x = x + xMove[k];//toa do dich theo hang
       next_y = y + yMove[k];//toa do dich theo cot
       if (isSafe(next_x, next_y, sol)) { //neu dich chuyen duoc
         sol[next_x][next_y] = movei;//ghi nhan thu tu buoc di
         if (solveKTUtil(next_x, next_y, movei+1, sol, xMove, yMove) == true)
             return true;
         else
             sol[next_x][next_y] = -1;// hoan tra lai cho backtracking
       }
   } 
   return false;
}
/* Driver program to test above functions */
int main() {
    solveKT();
    return 0;
}

