import java.io.*;
import java.util.*;

public class swapUsingBitwise {

    public static void swap(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        swap(x, y);
        System.out.print(y+" ");
        System.out.print(x);
        
        
    }
}