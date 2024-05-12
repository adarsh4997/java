/*
A school wants to capture an annual photo of its students by arranging them in a single line based on their height in a non-decreasing order. To achieve this, they create an integer array called expected which represents the expected height of each student in the line.

Given an integer array heights that indicates the current order in which the students are standing in line, with heights[i] denoting the height of the ith student (0-indexed), your task is to determine the number of indices where heights[i] does not match the corresponding expected[i] value.

NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// https://leetcode.com/problems/height-checker/

Input Format

First line of input contains integer N as size of array.

Second line of contains N integer representing the elements of array.

Constraints

1 <= N <= 100

1 <= heights[i] <= 100
Output Format

Return the number of indices where heights[i] does not match the corresponding expected[i] value.

Sample Input 0

6
1 1 4 2 1 3
Sample Output 0

3
Explanation 0

heights: [1,1,4,2,1,3] expected: [1,1,1,2,3,4] Indices 2, 4, and 5 do not match.
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class countingMismatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }
        
        //copying array to expected
        int[] expected = new int[n];
        for(int i = 0; i < n; i++){
            expected[i] = heights[i];
        }
        
        Arrays.sort(expected);
        
        int count = 0;
        for(int i = 0; i < n; i++){
            if(heights[i] != expected[i])
                count++;
        }
       
        System.out.println(count);
        
    }
}

