import java.io.*;
import java.util.*;

public class Permutation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        // for n!
        int f1 = 1;
        for (int i = 1; i <= n; i++) {
            f1 *= i;
        }

        // for (n-r)!
        int num = n - r;
        int f2 = 1;
        for (int i = 1; i <= num; i++) {
            f2 *= i;
        }

        // Permutation
        int per = f1 / f2;
        System.out.println(per);
        
    }
}