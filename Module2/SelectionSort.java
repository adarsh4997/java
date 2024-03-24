package java.Module2;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(A[j] < A[min])
                    min = j;
            }
            if(min != i){
                int temp = A[min];
                A[min] = A[i];
                A[i] = temp;
            }
        }
        for(int num: A){
            System.out.print(num+" ");
        } 
    }
}
