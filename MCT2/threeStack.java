package java.MCT2;

import java.util.*;


public class threeStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        int[] h1 = new int[n1];
        int[] h2 = new int[n2];
        int[] h3 = new int[n3];
        
        for (int i = 0; i < n1; i++) {
            h1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n2; i++) {
            h2[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n3; i++) {
            h3[i] = scanner.nextInt();
        }
        
        int maxHeight = getMaxEqualHeight(h1, h2, h3);
        
        System.out.println(maxHeight);
    }
    
    private static int getMaxEqualHeight(int[] h1, int[] h2, int[] h3) {
        int sum1 = getCumulativeHeight(h1);
        int sum2 = getCumulativeHeight(h2);
        int sum3 = getCumulativeHeight(h3);
        
        while (!isAllEqual(sum1, sum2, sum3)) {
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= h1[0];
                h1 = removeTopElement(h1);
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= h2[0];
                h2 = removeTopElement(h2);
            } else {
                sum3 -= h3[0];
                h3 = removeTopElement(h3);
            }
        }
        
        return sum1; // or sum2 or sum3 (since they are equal now)
    }
    
    private static int getCumulativeHeight(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    private static boolean isAllEqual(int a, int b, int c) {
        return a == b && b == c;
    }
    
    private static int[] removeTopElement(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, newArr.length);
        return newArr;
    }
}