/*
Take an Integer N as input and then take N integers input from Geeku.

Geeku wants to print all those integers whose frequency is exactly same as the integer's absolute value.

You have to help Geeku in doing so.

Note: 0 is excluded

Input Format

Integer N
N Integers
Constraints

1<=N<=10^5
-10^5<=n<=10^5
Output Format

As described in Problem Statement
Sample Input 0

10
4 5 -3 8 -3 4 4 -3 6 4
Sample Output 0

-3
4
 */

package java.MCT2;

import java.io.*;
import java.util.*;

public class sameNumberSameFreq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(A[i] == 0)    continue;
            hm.put(A[i], hm.getOrDefault(A[i],0)+1);
        }
        
        for(int i = 0; i < n; i++){
            int e = A[i];
            if(Math.abs(e) == hm.get(e)){
                System.out.println(e);
                hm.put(e,0);
            }
        }
        
    }
}
