
import static java.lang.Math.pow;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thu Uyên
 */
public class tongsn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float n = sc.nextFloat();
          float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum12=0;
          
          for(int i =1; i<=n;i++){
                    sum1 += 1.0/i;
          }
          System.out.printf("%.3f", sum1);
          System.out.println("");
           for(int i =1; i<=n;i++){
                    sum2 += i;
          }
          System.out.printf("%.3f", sum2);
           System.out.println("");
           for(int i =1; i<=n;i++){
                    sum3 += pow(i,2);
          }
          System.out.printf("%.3f", sum3);
          System.out.println("");
           for(int i =1; i<=n;i++){
                    sum4 += 1.0/(2*i);
          }
          System.out.printf("%.3f", sum4);
          System.out.println("");
           for(int i =0; i<=n;i++){
                    sum5 += 1.0/(2*n+1);
          }
          System.out.printf("%.3f", sum5);
          System.out.println("");
          for(int i=1; i<=n;i++){
                    sum6 += 1.0/(i*(i+1));
          }
          System.out.printf("%.3f", sum6);
          System.out.println("");
          for(int i=0; i<=n;i++){
                    sum7  += (2*i+1)/(2*i+2);
          }
          System.out.printf("%f", sum7);
          System.out.println("");
          float gthua =1;
          for(int i=1; i<=n;i++){
                    gthua *=i;
                    sum8 += gthua;
          }
          System.out.printf("%.3f", sum8);
          System.out.println("");
          float tong =0;
           for(int i=1; i<=n;i++){
                    tong += i;
                    sum12 += 1.0/tong;
          }
          System.out.printf("%.3f", sum12);
      
        // TODO code application logic here
    }
    
}
