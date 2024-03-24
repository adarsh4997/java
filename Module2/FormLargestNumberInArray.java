/*
Meet Sarah, an enthusiastic programmer who loves to solve challenging problems. She was recently given an array of non-negative integers and was asked to arrange its elements in such a way that they form the largest possible number.

Solve the problem by comparing the values of the elements in a way that produced the maximum possible number.

NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

Input Format

First line take an integer input from user as n , where n is the size of array.

Second line takes n elements as non-negative integers input in array.

Constraints

1<=n<=100

1<=arr[i]<=10^4
Output Format

Return the largest number

Sample Input 0

4
4 46 8 9
Sample Output 0

98464
 */

package java.Module2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FormLargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] A = new Integer[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
         
        //convert to string
        String[] S = new String[n];
        for(int i =0; i < n; i++){
            S[i] = String.valueOf(A[i]);
        }
        
        Comparator<String> myComp = new Comparator<String>(){
            public int compare(String a, String b){
                String x = a+b;
                String y = b+a;
                
                int v1 = Integer.parseInt(x);
                int v2 = Integer.parseInt(y); 
                
                return v2-v1;
            }
        };
        
        Arrays.sort(S, myComp);
        for(int i = 0; i < n; i++){
            System.out.print(S[i]);
        } 
    }
}
