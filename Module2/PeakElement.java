/*
Meet Laura, a data analyst who was given a task to identify peak elements from an array of numerical data. Laura was fascinated by the concept of peak elements and found them to be useful in many real-world scenarios, such as identifying the maximum temperature in a dataset.

Find the peak elements by comparing each element with its adjacent elements and find elements that satisfy the given condition.

**arr[i]** is a peak element only if **arr[i-1] < arr[i] > arr[i+1]**.

Input Format

An integer N, which is the size of the array.

N integers, depicting the elements of the array.

Constraints

0 <= arr.length <= 1000

0 <= arr[i] <= 1000
Output Format

Return All the peak elements.

Sample Input 0

6
4 5 3 8 6 1
Sample Output 0

5 8
Explanation 0

5 is a peak element arr[0] < arr[1] > arr[2].

8 is a peak element arr[2] < arr[3] > arr[4].
 */

package java.Module2;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        //logic
        for(int i = 1; i < n-1; i++){
            if(A[i] > A[i-1] && A[i] > A[i+1])
                System.out.print(A[i]+" ");
        }
   
    }
}
