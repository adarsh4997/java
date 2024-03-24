/*
Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.
Input Format

First line contains an integer n.

Second line contains an array of integers of size n.

Constraints

0 <= arr.length <= 10^5

109 <= arr[i] <= 10^9

Output Format

Returns an array.

Sample Input 0

4
40 10 20 30
Sample Output 0

4 1 2 3
Explanation 0

40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
 */

package java.Module2.Contest1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RankTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the array A
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            Set < Integer > s = new HashSet < Integer > ();
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    s.add(arr[j]);
                }
            }
        int rank = s.size() + 1;
        System.out.print(rank + " ");
        }
            
    }
}
