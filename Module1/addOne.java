/*
Take an array arr of size N as input which represents a large number.

Add 1 (one) to this large number and print the resultant array.

eg:- [4,2,3,6,5,8,7,1,5,3,9,6] In this case answer must be [4,2,3,6,5,8,7,1,5,3,9,7]

Note: The large integer does not contain any leading 0's in the array.

NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

Input Format

First line contains an integer N, which is the size of the array.

Second line contains N integers, depicting the elements of the array.

Constraints

1 <= N <= 1000

0 <= arr[i] <= 9
Output Format

The resultant array.

Sample Input 0

5
1 2 3 4 5 
Sample Output 0

1 2 3 4 6
Sample Input 1

1
9
Sample Output 1

1 0

 */
import java.util.*;

public class addOne {

    public static int[] addOne(int[] arr){
        int carry=1;
        for (int i = arr.length-1; i >= 0; i--) {
            int val=arr[i]+carry;
            if(val==10){
                arr[i]=0;
                carry=1;
            }
            else{       //if single digit
                arr[i]=val;
                carry=0;
            }
        }
        if(carry==1){
            arr= new int[arr.length+1];
            arr[0]=1;
        }

        return arr;
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        // array A[]
        int[] A= new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }

        int[] res= addOne(A);
        
        
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

     }
}