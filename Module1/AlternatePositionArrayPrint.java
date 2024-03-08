/*
Take n as an integer input. Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Declare the second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Then print the elements as explained below

Print the first element of the first array present at the 0th index, then the element of the second array at the 1st index, then the element of the first array at the 2nd index, then the element of the second array at the 3rd index, so on and so forth.

Input Format

First line contains integer N as size of arrays.

Second line contains N integers representing elements of first array.

Third line contains N integers representing elements of Second array.

Constraints

0 <= N <= 10^4

0 <= arr1[i] , arr2[i] <= 10^4
Output Format

print arrays elements aternatively.

Sample Input 0

5
10
20
30
40
50
100
200
300
400
500
Sample Output 0

10 200 30 400 50
Sample Input 1

10
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
Sample Output 1

1 12 3 14 5 16 7 18 9 20




*/

import java.util.Scanner;

public class AlternatePositionArrayPrint{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //First Array A[i]
        int n= sc.nextInt();
        int[] A= new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }

        //Second Array b[i]
        int[] B= new int[n];
        for (int i = 0; i < B.length; i++) {
            B[i]=sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                System.out.print(A[i]+" ");
            }
            else{
                System.out.print(B[i]+" ");
            }
        }

        
    }
}