/*
Check if two arrays are identical:
Take n as an integer input. Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

Declare the second array of size m that stores values of int data-type. Then take m integer inputs and store them in the array one by one.

Then print true if the arrays are equal and print false if the array is not equal.

Definition of Equal Arrays: Arrays whose size is equal and whose elements at the corresponding indexes are the same

Input Format

A number n denoting array1 size

n numbers representing elements of array1

A number m denoting array2 size

m numbers representing elements of array2

Constraints

1 <= n , m <= 1000000
1 <= array1[i] <= 1000000
1 <= array2[i] <= 1000000
Output Format

Print true or false

Sample Input 0

5
1 2 3 4 5
5 
1 2 3 4 5
Sample Output 0

true
Explanation 0

Since size of both arrays are same. And array1[i]==array2[i] is same for all 0<=i<=array.length.Therefore answer is true.




*/


import java.util.Scanner;

public class identicalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      

        int size = sc.nextInt();
        int[] A= new int[size];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] B= new int[size2];
        for (int i = 0; i < B.length; i++) {
            B[i]=sc.nextInt();
        }
        
        boolean ans=true;
        if(size!=size2){
            ans=false;
        }
        else{
            for (int i = 0; i < size; i++) {
                if(A[i]!=B[i]){
                    ans=false;
                }
            }
        }
        System.out.println(ans);
        
    }
}