/*
Given an array of size n with unique integer elements. And then take m as an integer input. Declare the second array of size m that stores values of int data-type. Then take m integer inputs and store them in the array one by one.

Then print all the elements of the first array which occur exactly twice in the second array.

Input Format

First line contains an integer number n representing size of first array.

Second line contains n integer inputs representing elements of first array.

Third line contains an integer number m representing size of second array.

Fourth line contains m integer inputs representing elements of second array.

Constraints

1 <= n , m <= 100000

0 <= arr1[i] , arr2[i] <= 100000
Output Format

An series on integer element in single line.

Sample Input 0

5
1 2 3 4 5
5
1 1 2 3 4
Sample Output 0

1 
Explanation 0

1 is only element of first array that has twice occurence in second array.


*/

import java.util.*;

public class doubleOccurenceIn2ndArray {

    public static int[] repeatTwice(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(A[i] + " ");
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // array A[]
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // array B[]
        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        repeatTwice(A, B);
    }
}