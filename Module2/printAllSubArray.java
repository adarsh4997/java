/*
As a programmer, Maria is always looking for new challenges. One day, she decided to write a program that would print all the possible subarrays of a given array of Integers.

She started by taking the array as input from the user and then wrote the logic to generate all the subarrays. Finally, she tested her program and was satisfied with the output.

Can you write a program that can print all the subarrays of a given array?

Input Format

An Integer input N representing size of array

N integer input representing elements of an array

Constraints

1<=N<=100

-10^6<=arr[i]<=10^6
Output Format

Print all subarrays

Sample Input 0

5
1 2 3 4 5
Sample Output 0

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
2 
2 3 
2 3 4 
2 3 4 5 
3 
3 4 
3 4 5 
4 
4 5 
5 
Explanation 0

array of length n has n*(n+1)/2 subarrays. here n = 5 and it has 15 subarrays.
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class printAllSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        //logic
        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                
                for(int k = start; k <=end; k++){
                    System.out.print(A[k]+" ");
                }
                System.out.println();
            }
        } 
    }
}
