/*
Let me introduce you to John, who loves to play with numbers. One day, he was given an unsorted array of integers and was challenged to transform it into a wave-like array. John found it interesting and decided to take up the challenge.

Help John by sorting the array into a wave like array. An array arr[0..n-1] is sorted in wave form if

arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..

Input Format

First line take an integer input from user as N , where N is the size of array.

Second line takes N elements as non-negative integers input in array.

Constraints

1<=n<=100

1<=arr[i]<=10^4
Output Format

Return the array in sorted wave form.

Sample Input 0

7
10 90 49 2 1 5 23
Sample Output 0

2 1 10 5 49 23 90 

 */

package java.Module2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInWaveForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        //logic
        Arrays.sort(A);
        for(int i = 0; i < n-1; i+=2){
            int temp = A[i];
            A[i] = A[i+1];
            A[i+1] = temp;
        }
        
        for(int num: A){
            System.out.print(num+" ");
        }  
    }
}
