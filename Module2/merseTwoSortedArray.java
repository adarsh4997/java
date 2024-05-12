/*
Given two sorted arrays A[] and B[] of size N and M. The task is to merge both the arrays into a single array in non-decreasing order.

Input Format

First line take an integer input from user as N , where N is the size of A[].

Second line takes N elements as Integer input in A[].

Third line take an integer input from user as M , where M is the size of B[].

Next line takes M elements as Integer input in B[].

NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

Constraints

1<=N<=200

1<=M<=200

-10^4 <= A[i], B[j] <= 10^4
Output Format

Return the merged Array.

Sample Input 0

4
1 3 5 7
4
2 4 6 8
Sample Output 0

1 2 3 4 5 6 7 8 
Explanation 0

The merged array contains all the elements from both arrays in sorted order.
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class merseTwoSortedArray {
    
    static void mergeArray(int[] A, int[] B){
        int n = A.length;
        int m = B.length;
        int[] C = new int[m+n];
        for(int i = 0; i < n; i++){
            C[i] = A[i];
        }
        for(int i = 0; i < m; i++){
            C[n+i] = B[i];
        }
        
        Arrays.sort(C);
        
        for(int i = 0; i < C.length; i++){
            System.out.print(C[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        //Array 2
        int m = sc.nextInt();
        int[] B = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = sc.nextInt();
        }
        
        mergeArray(A,B);
        
    }
}
