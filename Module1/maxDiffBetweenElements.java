/*
Given an array arr[] of integers, find out the maximum difference between any two elements such that larger element appears after the smaller number.

Input Format

First line contains an integer N represent the size of array.

Second line contains N number of integers represent the elements of array.

Constraints

0 <= N <= 10000

0 <= arr[i] <= 10000
Output Format

print the required output.

Sample Input 0

7
2 3 10 6 4 8 1
Sample Output 0

8

 */

import java.util.*;

public class maxDiffBetweenElements {

    public static int[] maxDifference(int[] arr) {
        int size = arr.length;
        int max=0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[i]) {
                    int diff = arr[j] - arr[i];
                    if (diff > max) {
                        max = diff;
                    }
                }
            }
        }
        System.out.println(max);
    return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // array A[]
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        maxDifference(A);

    }

}
