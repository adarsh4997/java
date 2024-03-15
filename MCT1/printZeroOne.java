/*
Task is to Print the given Pattern

Example:
Input: n = 5

**output: **

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1
Input Format

An integer input N.

Constraints

1 <= N <= 100

Output Format

print the pattern.

Sample Input 0

5
Sample Output 0

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1
Sample Input 1

3
Sample Output 1

1 
0 1 
1 0 1

*/

package java.MCT1;
import java.io.*;
import java.util.*;

public class printZeroOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        for(int row = 0; row < n; row++){
            if(row%2 == 0){
                int flag = 1;
                for(int i = 0; i < star; i++){
                    System.out.print(flag+" ");
                    flag = 1-flag;
                }
            }
            else{
                int flag = 0;
                for(int i = 0; i < star; i++){
                    System.out.print(flag+" ");
                    flag = 1-flag;
                }
            }
            
            System.out.println();
            star++;
        }
    }
}