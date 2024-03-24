package java.Module2;

import java.util.Scanner;

/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        for(int i = 1; i < n; i++){
            for(int j = i; j >= 1; j--){
                if(A[j] < A[j-1]){
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                else{
                    break;
                }
                
            }
        }
        
        for(int num: A){
            System.out.print(num+" ");
        }
    
    }
}