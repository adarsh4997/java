/*
You have given an array of integers of length n and a key. you need to find the last index of the key in the given array . If not present, then return -1.

Input Format

First line consists of an integer n.

Second line consists of an array of integers of size n.

Third line consists an integer key.

Constraints

1 < n <= 10^8
Output Format

Returns an integer as index.

Sample Input 0

5
1 2 3 4 4
4
Sample Output 0

4
Explanation 0

 the last index of the key is 4


*/


import java.util.Scanner;

public class findIndex{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //First Array A[i]
        int n= sc.nextInt();
        int[] A= new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }

        int k= sc.nextInt();

        int lastindex = -1;
        for (int i = 0; i < A.length; i++) {
            if(A[i]==k){
                lastindex=i;
            }
        }
        System.out.println(lastindex);

    }
}