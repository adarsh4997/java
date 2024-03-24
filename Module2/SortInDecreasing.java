package java.Module2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortInDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer[] A = new Integer[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A,Collections.reverseOrder());
        
        for(int i = 0; i < n; i++){
            System.out.print(A[i]+" ");
        }   
        
    }
}
