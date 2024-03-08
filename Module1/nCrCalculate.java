/*
calculate nCr factorial  

                        n!
                    ------------
                    r! (n-r)!

*/



import java.io.*;
import java.util.*;

public class nCrCalculate {

    public static int func(int n1, int r1){
        //for n!
        int val=1;
        for(int i=1;i<=n1;i++){
            val*=i;
        }

        //for (n-r)!
        int temp= n1-r1;
        int val2=1;
        for(int i=1;i<=temp;i++){
            val2*=i;
        }

        //for r!
        int val3=1;
        for(int i=1;i<=r1;i++){
            val3*=i;
        }

        int result=val/(val2*val3);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        System.out.println(func(n,r));
    }
}