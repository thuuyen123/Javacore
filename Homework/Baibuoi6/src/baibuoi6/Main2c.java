/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baibuoi6;

/**
 *
 * @author Thu Uyên
 */
public class Main2c {
    public static void main(String[] args) {
        int[][]  matrix = new int[3][3];
        int[][] maxtic = {{1,2,3}
                         ,{1,2,3}
                         ,{1,2,3}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = 1;
            }
            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(""+matrix[i][j]+" ");
            }
            System.out.println("");
        }
        for (int[] row : matrix) {//ko quan tâm đến chỉ số
            for (int cell : row) {
                System.out.print(""+cell+" ");
            }
            System.out.println("");
        }
    }
}
