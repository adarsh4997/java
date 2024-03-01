/*
 Program to add two array
A[3]={1,2,3}
B[3]={4,5,6}

adding will be C[6]={1,2,3,4,5,6}

*/

import java.util.Scanner;

public class addTwoArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //First Array A[i]
        int n= sc.nextInt();
        int[] A= new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }

        //Second Array b[i]
        int m= sc.nextInt();
        int[] B= new int[m];
        for (int i = 0; i < B.length; i++) {
            B[i]=sc.nextInt();
        }

        int total= A.length + B.length; // total length of A and B
        int[] C= new int[total];

        //Adding A in C array
        for (int i = 0; i < A.length; i++) {
            C[i]=A[i];
        }

        //Adding B in C array
        for (int i = 0; i < B.length; i++) {
            C[A.length+i]=B[i];
        }

        //Printing C array i.e. [A+B]
        for (int i = 0; i < total; i++) {
            System.out.print(C[i]+" ");
        }
    }
}