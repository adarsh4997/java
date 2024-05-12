/*
Sophie and her friend Luke decided to play a game with an array of integers. They wrote a program that sort the array in a unique way. The program sorted an array of integers in such a way that half of the integers were odd and the other half were even.

Moreover, whenever an odd number occurred in the array, it was placed at an odd index, and whenever an even number occurred in the array, it was placed at an even index. Both odd and even numbers were sorted in non-decreasing order.

Return any answer array that satisfies this condition.

Input Format

First line contains an integer N representing the size of the array.

Next N line contains N integers representing elements of the array.

Constraints

2 <= nums.length <= 2 * 104

nums.length is even.

Half of the integers in nums are even.

0 <= nums[i] <= 1000
Output Format

Return the answer where each element is seperated by a single space.

Sample Input 0

4
4
2
5
7
Sample Output 0

2 5 4 7
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class sortArrayByParity2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        int[] ans = new int[n];
        
        int even = 0;
        int odd = 1;
        for(int i = 0; i < n; i++){
            if(A[i] % 2 == 0){
                ans[even] = A[i];
                even+=2;
            }
            else{
                ans[odd] = A[i];
                odd+=2;
            }
        }
        
        for(int num: ans){
            System.out.print(num+" ");
        }  
        
    }
}
