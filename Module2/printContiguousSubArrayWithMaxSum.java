//Print Contiguous SubArray With Maximum Sum In Java

package java.Module2;

import java.io.*;
import java.util.*;

public class printContiguousSubArrayWithMaxSum {
    
    public static List<Integer> maxSubArray(int[] nums) {
        //Kadane's Algorithm
        int maxSum = nums[0];
        int sum = nums[0];
        int start = 0;
        int end = 0;
        int maxStart = 0;
        int maxEnd = 0;
        
        for(int i = 1; i < nums.length; i++){
            if(sum < 0){
                sum = nums[i];
                start = i;
            }
            else{
                sum += nums[i];
            }
            
            if(sum > maxSum){
                maxSum = sum;
                maxStart = start;
                maxEnd = i;
            }
        }
        
        List<Integer> list = new ArrayList<>();    //since we're unsure about the size of new subarray
        for(int j = maxStart; j <= maxEnd; j++){
            list.add(nums[j]);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        ArrayList<Integer> al = new ArrayList<>(maxSubArray(A));
        
        //to print list
        System.out.print("SubArray is: ");
        int sum = 0;
        for(int e : al){
            sum += e;
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.print("Sum "+ sum);
        
        
    }
}
