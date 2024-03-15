/*
Task to Print the Given Pattern

**Example: **

Input: n = 5

Output:

xooox                
oxoxo                
ooxoo                
oxoxo                
xooox
Input Format

An integer input N.

Constraints

1<=N<=100

Output Format

print the pattern

Sample Input 0

5
Sample Output 0

xooox 
oxoxo 
ooxoo 
oxoxo 
xooox

 */

package java.MCT1;
import java.io.*;
import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 0; row < n; row++){
            for(int i = 0; i < n; i++){
                if(row == i || row == n-i-1){
                    System.out.print("x");
                }
                else
                {
                    System.out.print("o");
                }
            }
            
            System.out.println();
            
        }
        
        
    }
}
