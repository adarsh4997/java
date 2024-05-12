/*
Given an integer array nums and an integer k, return the k most frequent elements.

If 2 elements have same frequency than print them in decreasing order.

Input Format

The first line contains N, i.e. the size of the array.

The second line contains N space-separated positive integers nums[i] denoting elements of the array.

The third line contains integer k.

Constraints

1 <= N <= 10^5

0 <= nums[i] <= 9

k is in the range [1, the number of unique elements in the array].

It is guaranteed that the answer is unique.
Output Format

Return the top k frequent elements.

Sample Input 0

7
1 1 1 2 2 3 3
2
Sample Output 0

1 3
 */

package java.Module2.Contest3;

import java.io.*;
import java.util.*;

public class kFrequentElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        while(k > 0)
        {
            int max = Integer.MIN_VALUE;
            int max_freq = Integer.MIN_VALUE;
            for(int i : map.keySet())
            {
                if(max_freq <= map.get(i)){
                    max_freq = map.get(i);
                    max = i;
                }
                
            }
            System.out.print(max + " ");
            map.remove(max);
            k--;
        }
    }
}
