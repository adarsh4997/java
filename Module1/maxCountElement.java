/*
Take an array of size n with integer elements. And Print an element in the array which occurs for the maximum number of times.

Input Format

First line contains an Integer number n representing size of array.

Second line contains n integer inputs representing elements of array.

Constraints

1 <= n <= 10000

-100000 <= arr[i] <= 100000
Output Format

Returns an Integer number

Sample Input 0

7
1 1 1 2 2 3 3
Sample Output 0

1
Explanation 0

1 has occured maximum times i.e 3.
 */

import java.util.*;

public class maxCountElement {

    public static int maxCount(int[] arr) {
        int size= arr.length;
        int count=0;
        int found=0;
        for (int i = 0; i < size; i++) {
            int repeat=0;
            for (int j = 0; j < size; j++) {
                if (arr[i]==arr[j]) {
                    repeat++;
                }
                if (repeat>count) {
                    count=repeat;                    
                    found=arr[i];
                }
            }
        }
    return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // array A[]
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        
        System.out.println(maxCount(A));

    }
}
