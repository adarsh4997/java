/*

This is leetcode 42 -- Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much maximum water it can trap after raining.

image

NOTE :-

After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

Input Format

First line contains an integer number n representing size of array.

Second line contains integer n integer inputs representing elements of array.

Constraints

1 <= N <= 1000

0 <= arr[i] <= 100000
Output Format

Returns an Integer number

Sample Input 0

12
0 1 0 2 1 0 1 3 2 1 2 1
Sample Output 0

6

 */

import java.util.*;

class waterStore{

    public static int trap(int[] A) {
        int n = A.length;
        
        //leftMax array
        int[] lMax = new int[n];
        lMax[0] = A[0];
        for(int i = 1; i < n; i++){
            lMax[i] = Math.max(A[i], lMax[i-1]);
        }
        
        //rightMax array
        int[] rMax = new int[n];
        rMax[n-1] = A[n-1];
        for(int i = n-2; i >= 0; i--){
            rMax[i] = Math.max(A[i], rMax[i+1]);
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans+=Math.min(lMax[i],rMax[i])-A[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array A
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i]= sc.nextInt();
        }
    
        System.out.println(trap(A));
        
    }
}