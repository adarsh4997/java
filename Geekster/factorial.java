import java.io.*;
import java.util.*;

public class factorial {
    // Function to calculate the factorial of a number
    public static long fact(int num) {
        // Base case: if the number is 0, return 1 (since the factorial of 0 is 1)
        if (num == 0)
            return 1;
        // Recursive case: multiply the current number by the factorial of the previous number
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        System.out.println(fact(N));
    }
}