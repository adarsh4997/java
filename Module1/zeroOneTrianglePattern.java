/*
Print Zero-One Triangle Pattern.

image

Input Format

First line contains an input integer n.

Constraints

1<=n<=100

Output Format

Print pattern.

Sample Input 0

5
Sample Output 0

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

 */
import java.io.*;
import java.util.*;
public class zeroOneTrianglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=1;
        for (int row = 0; row < n; row++){
            int value=row%2==0?1:0;
                for (int i = 0; i < temp; i++){
                    System.out.print(value+" ");
                    value=1-value;
                }
            System.out.println();
            temp++;
        }
            
    }
}