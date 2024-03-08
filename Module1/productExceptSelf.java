/*
Note: I've used division method: Dividing product of A[i] with each element.

Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

For each index print the product of all the elements except the element present at that index..

NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link ->https://leetcode.com/problems/product-of-array-except-self/

Input Format

First line contains integer N as Size of Array.

Second line contains N integer value as Arr[i] values

Constraints

NA

Output Format

Print value of Product of array except that particular index.

Sample Input 0

3
2
5
3
Sample Output 0

15
6
10
Explanation 0

Product of Array:-30 5*3=15 2*3=6 2*5=10

*/
import java.util.*;

public class productExceptSelf {

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] A =  new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]= sc.nextInt();
        }

        //ans array
        int[] ans= new int[n];
        int zero=0;
        int prod=1;
        
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {
                prod *= A[i];
            }
            else{
                zero++;
            }
        }
        if(zero==0){
            for (int i = 0; i < n; i++) {
                ans[i]=prod/A[i];
            }
        }
        else if(zero==1){
            for (int i = 0; i < n; i++) {
                if(A[i]==0){
                    ans[i]=prod;
                }
            }
        }

        //print
        for (int i = 0; i < ans.length; i++) {
           System.out.println(ans[i]); 
        }



     }
}