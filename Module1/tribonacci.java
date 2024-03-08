import java.util.Scanner;
public class tribonacci {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        /*
        nth term Tn of The Tribonacci sequence is defined as follows:

        T0(0th term) = 0, 
        T1(1st term) = 1, 
        T2(2nd term) = 1, 
        and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.    */

        int a=0;
        int b=1;
        int c=1;
        int i=0;
        while (i<n) {
            int next=a+b+c;
            a=b;
            b=c;
            c=next;
            i++;
        }
        System.out.println(a+" ");

    }
}