/*
Take the array of size n and their values from user. And Print all the permutation pairs in the array from the last.

Input Format

First line contains an integer number n representing size of array.

Second line contains n numbers representing elements of the array and all element will be unique.

Constraints

1 <= n <= 100000

0 <= array[index] <= 100000
Output Format

Print all pairs in differnt line.

Sample Input 0

5
1 2 3 4 5
Sample Output 0

5 5
5 4
5 3
5 2
5 1
4 5
4 4
4 3
4 2
4 1
3 5
3 4
3 3
3 2
3 1
2 5
2 4
2 3
2 2
2 1
1 5
1 4
1 3
1 2
1 1
Explanation 0

Since we are given 5 number and started with last index. Therefore,firstly last number can pair up with all elements.

Similarly then 2nd last number can pair up with all elements and so on.

 */


import java.util.*;

public class reversePair {

    public static void reversePair(int[] arr) {
        int size = arr.length-1;
        for (int i = size; i >= 0; i--) {
            for (int j = size; j >=0; j--) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // array A[]
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        reversePair(A);
    }
}
