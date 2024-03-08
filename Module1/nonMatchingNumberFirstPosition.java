/*
Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Then again declare a second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one. Then print the index at which you find the first non matching number in the array.

Input Format

First line consists Value N representing Size of array

Second Line consists of N Integer values Representing the values of Arr1

Third Again** N** int values representaing the value of arr2

Constraints

1 <= N <= 10^9
Output Format

Returns an index of arr2 where you find first non matching integer value

Sample Input 0

5
10
20
30
40
50
10
20
23
40
52
Sample Output 0

2
Explanation 0

First NON MATCHING INT value is 23 that is on idx 2 of arr2

 */


import java.util.Scanner;

public class nonMatchingNumberFirstPosition{

    public static int nonMatch(int[] A, int[] B){
        for (int i = 0; i < A.length; i++) {
            if(A[i]!=B[i]){
                return i;
            }     
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //First Array A[i]
        int n= sc.nextInt();
        int[] A= new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }

        // Second Array B[i]
        int[] B= new int[n];
        for (int i = 0; i < B.length; i++) {
            B[i]=sc.nextInt();
        }
        System.out.println(nonMatch(A, B));
        
    }
}