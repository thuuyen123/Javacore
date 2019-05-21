#include    <iostream>
#define     MAX      100
using namespace std;
int X[MAX], A[MAX], n, k, dem=0, OK =1, tong=0; FILE *fp;
void  Init (void) {
      fp = fopen("dayso.in","r");
      fscanf(fp,"%d%d",&n,&k);
      for (int i =1; i<=n; i++) 
          fscanf(fp,"%d",&A[i]);
      fclose(fp);
}

void Result(void) {
     cout<<"\n Ket qua "<<++dem<<":";
     fprintf(fp,"%d:",dem);
     for(int i=1; i<=n; i++){
         if(X[i] ) {
                 fprintf (fp,"%5d",A[i]);
                 printf("%5d",A[i]);
         }
     }
     fprintf(fp,"\n");     
}
int Test(void ){
    int S = 0; //Tong phan tu cua day con
    for(int i=1; i<=n; i++)
            S = S + A[i]*X[i];
    if (S == k ) return(1);
    return (0);
}
void Back_Track(int i){
     for(int j=0; j<=1; j++){
         X[i]= j;tong = tong+A[i]*X[i];
         //printf("\n i=%d tong =%d",i, tong);getch();
         if ( i==n ) { dem++;
              if(tong==k) Result();
         }
         else if (tong<=k) Back_Track(i+1);     
         tong = tong-A[i]*X[i];
         //printf("\n 2tong =%d", tong);getch();
     }
}
int main (void ){
     Init(); fp = fopen("ketqua.out","w");
     Back_Track(1);
     printf("\n Dem=%d", dem);
     system("PAUSE");fclose(fp);return 0;
}
     
            
