/*
Take an array arr of size N as input which represents a large number. Add X to this large number and print the resultant array.

eg:-for X = 2 and array is [4,2,3,6,5,8,7,1,5,3,9,6] In this case answer must be [4,2,3,6,5,8,7,1,5,3,9,8]

Note: The large integer does not contain any leading 0's in the array.

Input Format

First line contains an integer N representing the length of array.

Second line contains N integers representing the elements of array.

Third line contains an integer X .

Constraints

1 <= N <= 1000000

0 <= arr[i] <= 9

0 <= X <= 9
Output Format

print the resultant array.

Sample Input 0

10
1 8 7 5 2 2 9 3 7 4
9
Sample Output 0

1 8 7 5 2 2 9 3 8 3 

*/

package java.MCT1;
import java.io.*;
import java.util.*;

public class addX {
    
    static int[] numAdd(int[] arr, int k){
        int n = arr.length;
        int digit = k;
        for(int i = n-1; i >= 0; i--){
            int t = arr[i] + digit;
            arr[i] = t % 10;
            digit = t / 10;
        }
        if(digit != 0){
            System.out.print(digit+" ");
        }
    
        return arr;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //taking array input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        //taking number that need to be added
        int k = sc.nextInt();
        
        int[] res = numAdd(arr, k);
        
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i]+" ");
        }
        
        
    }
}
