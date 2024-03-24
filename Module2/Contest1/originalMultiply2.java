/*
You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.

You then do the following steps:

If original is found in nums, multiply it by two (i.e., set original = 2 * original). Otherwise, stop the process. Repeat this process with the new number as long as you keep finding the number.

Return the final value of original.

Input Format

First line contains an integer n.

Second line contains an array of integers of size n.

Third line contains an integer original

Constraints

1 <= nums.length <= 1000

1 <= nums[i], original <= 1000

Output Format

Returns an integer.

Sample Input 0

5
5 3 6 1 12
3
Sample Output 0

24
Explanation 0

3 is found in nums. 3 is multiplied by 2 to obtain 6.

6 is found in nums. 6 is multiplied by 2 to obtain 12.
12 is found in nums. 12 is multiplied by 2 to obtain 24.
24 is not found in nums. Thus, 24 is returned.

 */

package java.Module2.Contest1;

import java.util.Scanner;

public class originalMultiply2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for(int i = 0;  i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        int original = sc.nextInt();
        
        
        for(int i = 0; i < n; i++){
            if(nums[i] == original){
                original = 2*original;
            }
        }
        System.out.println(original);
    }
}
