/*
Meet Sarah, an enthusiastic programmer who loves to solve challenging problems. She was recently given an array of non-negative integers and was asked to arrange its elements in such a way that they form the Smallest possible number.

Solve the problem by comparing the values of the elements in a way that produced the Smallest possible number.

Input Format

First line take an integer input from user as N , where N is the size of array.

Second line takes N elements as non-negative integers input in array.

Constraints

1<=N<=100

1<=arr[i]<=10^4
Output Format

Return the smallest number.

Sample Input 0

6
5 6 2 9 21 1
Sample Output 0

1212569
Explanation 0

Print the smallest number.
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class formSmallestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        //converting to string array
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = Integer.toString(A[i]);
        }
        
        Comparator<String> myComp = new Comparator<String>(){
            
            public int compare(String a, String b){
                String x = a+b;
                String y = b+a;
                return x.compareTo(y);
            }
            
        };
        
        Arrays.sort(str, myComp);
        
        //another way to define comparator
        // Arrays.sort(str, new Comparator<String>() {
        //     public int compare(String a, String b) {
        //         String ab = a + b;
        //         String ba = b + a;
        //         return ab.compareTo(ba);
        //     }
        // });
        
        
        for(String s : str){
            System.out.print(s);
        }
        
        
    }
}
