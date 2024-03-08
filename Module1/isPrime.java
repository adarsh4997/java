/*

This program firstly takes how many times you want to test this program and after that check if the entered number is prime or not. 
*/

import java.util.Scanner;

public class isPrime {

    static void isPrime(int n){
        int count=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0)
                count++;
        }
        if(count==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t!=0) {
            int n= sc.nextInt();
            isPrime(n);
            t--;
        }
    }
}