/*
https://www.geeksforgeeks.org/problems/facing-the-sun2126/1
 */
package java.Module2.Contest5;

import java.io.*;
import java.util.*;

public class facingSun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        int count = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
                count++;
            }
        }
        System.out.print(count);
        
    }
}
