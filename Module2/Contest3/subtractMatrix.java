/*
You are given two matrices , your task is to subtract the given matrices , and then print the resultant matrix using tab spaces.

Input Format

First line contains, m1 and n1 depicting the size of first matrix.
m1*n1 Integer values, depicting all the elements of matrix.
Third line contains, m2 and n2 depicting the size of second matrix.
m2*n2 Integer values, depicting all the elements of matrix.
Constraints

1 <= m1 and n1 <=1000

1<=m2 and n2<=1000

-1000<=mat[i][j]<=1000

Output Format

Print the resultant matrix.

Sample Input 0

3
3
4 9 5
0 1 0
9 4 2
3
3
3 8 7
5 9 7
1 6 1
Sample Output 0

1   1   -2   
-5   -8   -7   
8   -2   1   
Explanation 0

Print the matrix after subtracting

 */
package java.Module2.Contest3;
import java.io.*;
import java.util.*;

public class subtractMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //matrix A
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int[][] A = new int[m1][n1];
        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n1; j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        //matrix B
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] B = new int[m2][n2];
        for(int i = 0; i < m2; i++){
            for(int j = 0; j < n2; j++){
                B[i][j] = sc.nextInt();
            }
        }
        
        //logic
        int[][] C = null;
        if(m1 == m2 && n1 == n2){
            C = new int[m1][n1];
            for(int i = 0; i < m1; i++){
                for(int j = 0; j < n1; j++){
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
        }
        
        if(C != null){
            for(int[] row: C){
                for(int matrix: row){
                    System.out.print(matrix+"   ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println(-1);
        }   
        
    }
}