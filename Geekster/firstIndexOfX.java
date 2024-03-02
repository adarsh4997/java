/*
You have given array of n elements and key . you need to find the first index in the array . If key does not exist then return -1.

Input Format

First Line consists of an integer n.

Second Line consists of n integers representing an array.

Third line consists of a key.

Constraints

1 < n <= 10^8
Output Format

Returns an index as integer assuming 0 based indexing.

Sample Input 0

5
1 2 3 3 3
3
Sample Output 0

2
Explanation 0

the first index key is occuring at index 2

 */


import java.util.Scanner;

public class firstIndexOfX{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //First Array A[i]
        int n= sc.nextInt();
        int[] A= new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }

        int x= sc.nextInt();
        int found=-1;
        for (int i = 0; i < A.length; i++) {
            if(A[i]==x){
                found=i;
                System.out.println(found);
                break;
            }
        }
        if (found == -1) {
            System.out.println(found);
        }
    }
}