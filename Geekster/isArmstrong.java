/*
 An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
e.g. 153= (1^3)+(5^3)+(3^3)
     153=153 --> So it is a Armstrong number
*/

import java.util.Scanner;

public class isArmstrong {

    static void isArmstrong(int n){
        int num=n;
        int sum=0;
        while (n>0) {
            int rem = n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        if(sum==num)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isArmstrong(n);
        
    }
}
