/*
You are required to create an array ans of length 2n that, given an integer array nums of length n, has the properties ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= < n. (0-indexed). Specifically, ans is the concatenation of two nums arrays. Return the array ans. Note: Nexus is a synonym for concatenation.

Input Format

First line of input contains an integer N as size of array.

Second line of input contains N integers as elements of array.

Constraints

1 <= n <= 1000

1 <= nums[i] <= 1000
Output Format

print the ans array.

Sample Input 0

4
1 3 2 1
Sample Output 0

1 3 2 1 1 3 2 1
Explanation 0

The array ans is formed as follows: - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]] - ans = [1,3,2,1,1,3,2,1]
 */

package java.MCT1;
import java.io.*;
import java.util.*;

public class nexusArray {
    
    public static int[] concat(int[] arr){
        int n = arr.length;
        int[] ans = new int[n+n];
        
        for(int i = 0; i < n; i++){
            ans[i] = arr[i];
        }
        for(int i = n; i < (2*n); i++){
            ans[i] = arr[i-n];
        }
        
       return ans; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] res = concat(arr);
        
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i]+" ");
        }
        
        
    }
}

/*
int[] ans = new int[2*n];

*/