/*
Liam is a stock trader who is analyzing the stock prices of a company. He has stored the stock prices in an array of size N. Liam wants to find out if there is a subarray of the stock prices whose sum is zero. If such a subarray exists, Liam can take advantage of it to make a profit.

Can you write a program to help Liam determine whether the array contains a subarray whose sum is zero?

Input Format

An Integer input N representing size of array

N integer input representing elements of an array

Constraints

1<=N<=9

-10^6<=n<=10^6
Output Format

Return True/False

Sample Input 0

4
-1 1 2 3
Sample Output 0

true
Explanation 0

1 + (-1) = 0
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class sumEqualsZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        //logic
        boolean res = false;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += A[k];
                }
                if(sum == 0){
                    res = true;
                }
            }
        }
        System.out.println(res);
    }
}
