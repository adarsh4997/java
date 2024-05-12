/*
Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].

Print all the leader elements separated by space and in the same order they are present in the input array.

Input Format

The first line of the input contains an integer T, denoting the number of test cases. The description of T test cases follows.

Each test case consist a an integer N , which describes the length of array.

N integer number representing elements of the array.

Constraints

1 <= T <= 200

1 <= N <= 10^4

1 <= arr[i]<= 10^4

Output Format

leaders of array (separated by space)

Sample Input 0

5
3
15 8 12
8
17 14 7 14 10 3 14 14
7
14 13 14 17 11 9 11
1
19
2
7 14
Sample Output 0

15 12 
17 14 14 14 14 
17 11 11 
19 
14 
 */

package java.Module2.Contest6;

import java.io.*;
import java.util.*;

public class leadersInArray {
    
    public static Stack<Integer> leaderElement(int[] A){
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i = n-1; i >= 0; i--){
            if(st.isEmpty() || st.peek() <= A[i]){
                st.push(A[i]);
            }
        }
        return st;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] A = new int[n];
            for(int i = 0; i < n; i++){
                A[i] = sc.nextInt();
            }
            
            Stack<Integer> leader = leaderElement(A);
            while(!leader.isEmpty()){
                System.out.print(leader.pop()+" ");
            }
            System.out.println();
        }
    }
}
