/*
Sophie is a student who enjoys playing video games in her free time. One of her favorite games involves an array of integers. Sophie noticed that the array was unsorted and she wanted to sort it in a unique way.

She thought of an interesting challenge - to sort the array acccording to the cubes of the elements.

Help Sophie and write a program that sort the array according to teh cubes of the elements.

Input Format

First line take an integer input from user as N , where N is the size of array.

Second line takes N elements as integers input in array.

Constraints

1 <= N <= 100

-10^2 <= arr[i] <= 10^2
Output Format

Return the sorted array according to their cubes.

Sample Input 0

5
4 -1 0 -5 6
Sample Output 0

-5 -1 0 4 6 
Explanation 0

Print the sorted array
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class sortArrayAccordingCubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        //Using bubble sort to sort the array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                if( (A[j]*A[j]*A[j]) > (A[j+1]*A[j+1]*A[j+1]) ){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                } 
            }
        }
        
        
        for(int num: A){
            System.out.print(num+" ");
        }
        
    }
}
