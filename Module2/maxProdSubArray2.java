/*
Sofia is a student who is struggling with her grades in math class. Her teacher has given her a list of N integers, and she needs to find the contiguous subarray with the largest product. Can you help Sofia find the solution to this problem?

Note: According to testcases answer will not overflow long

NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . 
Click here:  https://leetcode.com/problems/maximum-product-subarray/

Input Format

First line contain N, number of elements in an array.

Second line contain N integers representing array elements.

Constraints

1 <= N <= 1000000

-100 <= A[i] <= 100
Output Format

return the contiguous subarray with the largest product.

Sample Input 0

4
2 3 -2 4 
Sample Output 0

6
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class maxProdSubArray2 {
    
    public static int maxProd(int[] nums){
        int maxProd = Integer.MIN_VALUE;
        int pref = 1;
        int suff = 1;
        for(int i = 0; i < nums.length; i++){
            if(pref == 0)   pref = 1;
            if(suff == 0)   suff = 1;
            
            pref *= nums[i];
            suff *= nums[nums.length-1-i];
            
            int sum = Math.max(pref, suff);
            maxProd = Math.max(sum, maxProd);
        }
        return maxProd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
            
        System.out.println(maxProd(nums));
        
    }
}




