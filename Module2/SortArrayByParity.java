/*
Given an integer array nums[] , move all the even integers at the beginning of the array followed by all the odd integers in non- decreasing order.

Input Format

First line contains an integer N representing the size to the array.

Next N lines contains integer representing elements of array.

Constraints

1 <= N <= 5000

0 <= nums[i] <= 5000
Output Format

Print the final array, each element is seperated by a single space.

Sample Input 0

4
3 1 2 4
Sample Output 0

2 4 1 3
Explanation 0

All even numbers are in the beginning and odd numbers are at the end

 */

package java.Module2;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        //logic
        int i = 0;
        int j = n-1;
        while(i<=j){
            if(A[i] % 2 == 0){
                i++;
            }
            else if(A[j] % 2 != 0){
                j--;
            }
            else{
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        
        Arrays.sort(A, 0,i);
        Arrays.sort(A, i,n);
        
        for(int num: A){
            System.out.print(num+" ");
        }
 
    }
}
