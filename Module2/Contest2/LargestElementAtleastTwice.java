/*
You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

Input Format

First line contains an integer n.

Second line contains an array of integers of size n.

Constraints

2 <= nums.length <= 50

0 <= nums[i] <= 100

The largest element in nums is unique.

Output Format

Return an integer.

Sample Input 0

4
3 6 1 0
Sample Output 0

1
Explanation 0

6 is the largest integer.

For every other number in the array x, 6 is at least twice as big as x.

The index of value 6 is 1, so we return 1.

 */

package java.Module2.Contest2;

import java.util.Scanner;

public class LargestElementAtleastTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        int largest = A[0];
        int largeIndex = 0;
        for(int i = 0; i < n; i++){
            if(A[i] > largest){
                largest = A[i];
                largeIndex = i;
            }
    
        }
        
        // Check if the largest element is at least twice as much as every other number
        for(int i = 0; i < n; i++){
            if(i != largeIndex && A[i] * 2 > largest){
                System.out.println("-1");
                return; 
            }
        }
        
        
        System.out.println(largeIndex);
        
    }
}
