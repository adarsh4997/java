/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question. Click here

Input Format

An integer T representing no. of test cases.
An integer number n representing size of array.
N integer inputs representing elements of array.
Constraints

1 <= T <= 1000
1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
Output Format

An array with all zeroes at the end.

Sample Input 0

5
9
46 0 38 0 6 9 9 15 0
9
18 5 29 0 0 0 35 0 16
7
25 0 4 0 0 17 0
6
8 0 34 0 26 36
7
0 46 27 0 0 17 11
Sample Output 0

46 38 6 9 9 15 0 0 0 
18 5 29 35 16 0 0 0 0 
25 4 17 0 0 0 0 
8 34 26 36 0 0 
46 27 17 11 0 0 0 

 */

package java.Module2.Contest2;

import java.util.*;

public class ShiftZero {
    
    public static int[] shiftZero(int[] A){
        int n = A.length;
        int z = 0;
        int nz = 0;
        while(nz < n){
            if(A[nz] != 0){
                int temp = A[nz];
                A[nz] = A[z];
                A[z] = temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            int[] A = new int[n];
            for(int i = 0; i < n; i++){
                A[i] = sc.nextInt();
            }
            
            shiftZero(A);
            
            for(int nums: A){
                System.out.print(nums+" ");
            }
            System.out.println();
            
            t--;
        }
    }
}
