/*
Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

For each index print the sum of all the elements except the element present at that index..

Input Format

First line consists N as Size of Array.

Second line consists N Int value as Arr[i] values

Constraints

NA

Output Format

Print value of sum of array except that particular idx

Sample Input 0

4
2
7
8
9
Sample Output 0

24
19
18
17
Explanation 0

Sum of Arrays Element is 26

26-2=24

26-7=19

26-8=18

26-9=17

 */

import java.util.*;

public class sumOfElementsExceptSelf {
    
    public static int[] sumExceptSelf(int[] A){
        int[] result= new int[A.length];

        //sum of all total elements in array
        int sum=0;
        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
        }

        //sum of elements except self
        for (int i = 0; i < A.length; i++) {
            result[i]=sum-A[i];
        }        
        return result;
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        //Taking array of size n
        int[] A= new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }

        //output of result array:- the function returns an array which we're printing here.
        int[] total= sumExceptSelf(A);
        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i]+" ");
        }

     }
}