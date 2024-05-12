/*
Mathematics marks of N students are arranged in an array and two teachers are forming a team each for Maths Olympiad.

They select students turn wise, in each turn, they select a student marks and removes it from the array. This goes on until only one mark is left in the array. Considering teacher1 takes the first turn, can you tell us which mark will be left in the array after N−1 turns.

The first teacher wants to minimize the last number that would be left in the array, while the second teacher wants to maximize it.

You want to know what number will be left in the array after N−1 turns if both teachers make optimal moves.

Input Format

First line contains N, i.e. the size of the array.

Second line contains N space-separated positive integers A[i] denoting elements of the array.

Constraints

1 <= N <= 10^6

1 <= A[i] <= 10^6
Output Format

Return the last remaining number.

Sample Input 0

3
2 1 3
Sample Output 0

2
Sample Input 1

6
1 3 4 2 8 7 
Sample Output 1

4
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class olympiadTeamSelection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        
       System.out.print(A[n/2]);
        
        
    }
}
