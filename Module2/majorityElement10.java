/*
In this task you are supposed to find the majority element of a given array. A majority element of a given array of size N is defined as the element that occurs atleast N/2 times in it.

If N is odd, apply the ceiling function on N/2. So, given an array, compute its majority element.

NOTE :-

After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

Input Format

The first line contains a single integer N denoting the size of the given array.

The next line contains N space-separated integers denoting the elements of the array .

Constraints

(1 ≤ N ≤ 10^5 )

(−10^9 ≤ A[i] ≤ 10^9 )
Output Format

Print a single integer X, which is the majority element of the given array. If more than one

majority element exist, print the greatest one. If no majority element is present, print “NO MAJORITY ELEMENT”.

Sample Input 0

11
1 2 2 2 8 8 1 1 1 1 1
Sample Output 0

1
Explanation 0

Here, '1' is the majority element as it is satisfying the question constraint

Sample Input 1

12
1 2 -7 -1 -1 7 -23 -23 -12 -67 12 78
Sample Output 1

NO MAJORITY ELEMENT
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class majorityElement10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        int count = 1;
        int candidate = A[0];
        for(int i = 1; i < n; i++){
            if(candidate == A[i]){
                count++;
            }
            else{
                count--;
            }
            
           if(count == 0){
               candidate = A[i];
               count = 1;
           } 
        }
        
        //verify
        count = 0;
        for (int num : A) {
            if (num == candidate) {
                count++;
            }
        }
        
        if (count >= (n+1)/2) {
            System.out.println(candidate);
        } else {
            System.out.println("NO MAJORITY ELEMENT");
        }
        
    }
}

