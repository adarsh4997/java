/*
 An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
e.g. 153= (1^3)+(5^3)+(3^3)
     153=153 --> So it is a Armstrong number
*/

//This one is updated code 


import java.io.*;
import java.util.*;
public class isArmstrong {

    static void isArmstrong(int n, int k){
        for (int i = n; i <= k; i++) {
            int original=i;
            int sum=0;
            int count=isCount(original);
            int temp=original;
            while (temp!=0) {
                int rem = temp % 10;
                sum += Math.pow(rem, count);
                temp /= 10;
            }
            if (original == sum) {
                System.out.println(original);
            }
        }
    }

    //added count method to count number of digits.

    static int isCount(int num){
        int count=0;
        while (num!=0) {
            num/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        isArmstrong(n,k);
            
    }
}
