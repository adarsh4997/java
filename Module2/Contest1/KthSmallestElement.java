/*
Meet Sarah, a computer science student who is working on a project that requires finding the Kth smallest element in an array.

The array contains distinct elements, and Sarah's task is to determine the Kth smallest element where K is less than the size of the array.

Input Format

First line take an integer input from user as N , where N is the size of array.

Second line takes N elements as Integer input in array.

Third line take an integer input K .

Constraints

1 <= N <= 10^5

1 <= arr[i] <= 10^5

1 <= K <= N
Output Format

Return an integer representing kth smallest element

Sample Input 0

5
7 3 1 8 5 
2
Sample Output 0

3

 */


package java.Module2.Contest1;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] A = new int[n];
        for(int i = 0;  i < n; i++){
            A[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        Arrays.sort(A);
        
        System.out.print(A[k-1]);     
        
    }

}
